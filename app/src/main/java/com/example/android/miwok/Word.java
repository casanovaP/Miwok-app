package com.example.android.miwok;

public class Word {

    //declare Word class variables
    private String mDefaultTranslation;
    private String mMiwoktranslation;
    private int mImageResourceId;


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
}
