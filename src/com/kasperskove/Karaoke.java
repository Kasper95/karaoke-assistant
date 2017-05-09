package com.kasperskove;

import com.kasperskove.model.Song;
import com.kasperskove.model.SongBook;

public class Karaoke {

    public Karaoke() {
    }

    public static void main(String[] args) {

        SongBook songBook = new SongBook();

        Song song = new Song ("Michael Jackson", "Beat it", "https://www.youtube.com/watch?v=Ym0hZG-zNOk");
        songBook.addSong(song);
        System.out.printf("adding %s %n", song);

        System.out.printf("There are %d songs. %n", songBook.getSongCount());
    }
}
