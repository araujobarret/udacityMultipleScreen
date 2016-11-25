package model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.R;

import java.util.ArrayList;

import static android.R.attr.gravity;

/**
 * Created by root on 17/11/16.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int colorId;
    public WordAdapter(Context context, ArrayList<Word> words, int colorId){
        super(context, 0, words);
        this.colorId = colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Word word = getItem(position);
        int color = ContextCompat.getColor(getContext(), colorId);
        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);


        View container = convertView.findViewById(R.id.text_container);
        TextView tvDefault = (TextView) convertView.findViewById(R.id.english_word);
        TextView tvMiwok = (TextView) convertView.findViewById(R.id.miwok_word);
        ImageView tvImage = (ImageView) convertView.findViewById(R.id.image_word);

        container.setBackgroundColor(color);

        tvDefault.setText(word.getDefaultTranslation());
        tvMiwok.setText(word.getMiwokTranslation());


        if(word.hasImage()){
            tvImage.setImageResource(word.getmImageResourceId());
            tvImage.setVisibility(View.VISIBLE);
        }
        else
            tvImage.setVisibility(View.GONE);


        return convertView;

    }
}
