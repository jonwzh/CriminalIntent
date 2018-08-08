package com.jonwzh.criminalintent;

import java.util.UUID;

public class Crime {
    private UUID mID;
    private String mTitle;

    public Crime() {
        // Generate unique identifier
        mID = UUID.randomUUID();
    }

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

}
