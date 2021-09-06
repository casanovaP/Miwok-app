package com.example.android.miwok;

public class Word {

    //declare Word class variables
    private String mDefaultTranslation;
    private String mMiwoktranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    //constructor needs to have the same name as the class
    //decide parameters to pass in and assign them to the variables
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwoktranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwoktranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
    }

    //getters methods are public to be called from outside
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwoktranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    //returns whether or not there is an image for this word
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
