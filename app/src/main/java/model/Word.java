package model;

import android.graphics.drawable.Drawable;

/**
 * Created by root on 17/11/16.
 */

public class Word  {
    String defaultTranslation, miwokTranslation;

    int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageId){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.mImageResourceId = imageId;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns true if have a image or false if doesn't
     */
    public boolean hasImage(){
        return this.mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
