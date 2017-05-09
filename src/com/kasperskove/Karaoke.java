package com.kasperskove;

import com.kasperskove.model.SongBook;

public class Karaoke {

    public Karaoke() {
    }

    public static void main(String[] args) {

        SongBook songBook = new SongBook();

        KaraokeMachine machine = new KaraokeMachine(songBook);
        machine.run();
    }
}
