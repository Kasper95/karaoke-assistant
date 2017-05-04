package com.kasperskove;

/**
 * Created by KASPER on 5/4/17.
 */
public class Song {
    private String mArtist;
    private String mTitle;
    private String mVideoUrl;

    public Song(String var1, String var2, String var3) {
        this.mArtist = var1;
        this.mTitle = var2;
        this.mVideoUrl = var3;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getArtist() {
        return this.mArtist;
    }

    public String getVideoUrl() {
        return this.mVideoUrl;
    }

    public String toString() {
        return String.format("Song:  %s by %s", new Object[]{this.mTitle, this.mArtist});
    }
}
