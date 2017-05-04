package com.kasperskove;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KASPER on 5/4/17.
 */
public class SongBook {
    private List<Song> mSongs = new ArrayList();

    public SongBook() {
    }

    public void addSong(Song var1) {
        this.mSongs.add(var1);
    }

    public int getSongCount() {
        return this.mSongs.size();
    }
}
