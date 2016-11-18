package model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.miwok.R;

import java.util.ArrayList;

/**
 * Created by root on 17/11/16.
 */

public class PersonAdapter extends ArrayAdapter<Person> {
    public PersonAdapter(Context context, ArrayList<Person> persons){
        super(context, 0, persons);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Person person = getItem(position);
        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_person, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvCelphone = (TextView) convertView.findViewById(R.id.tvCelphone);
        TextView tvJob = (TextView) convertView.findViewById(R.id.tvJob);

        tvName.setText(person.getName());
        tvCelphone.setText(person.getCelphone());
        tvJob.setText(person.getJob());

        return convertView;

    }

}
