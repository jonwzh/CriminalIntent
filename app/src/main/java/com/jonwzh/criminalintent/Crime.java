package com.jonwzh.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mID;
    private String mTitle;

    private Date mDate;
    private boolean mSolved;

    public Crime() {
        // Generate unique identifier
        mID = UUID.randomUUID();

        // Generate the date
        mDate = new Date();
    }

    @Override
    public String toString() {
        return mTitle;
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

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

}
