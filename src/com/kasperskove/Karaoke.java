package com.kasperskove;

/**
 * Created by KASPER on 5/4/17.
 */
public class Karaoke {

    public Karaoke() {
    }

    public static void main(String[] var0) {
        Song var1 = new Song("Michael Jackson", "Beat It", "https://www.youtube.com/watch?v=SaEC9i9QOvk");
        SongBook var2 = new SongBook();
        System.out.printf("Adding %s %n", new Object[]{var1});
        var2.addSong(var1);
        System.out.printf("There are %d songs. %n", new Object[]{Integer.valueOf(var2.getSongCount())});
    }
}
