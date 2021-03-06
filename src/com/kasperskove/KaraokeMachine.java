package com.kasperskove;

import com.kasperskove.model.Song;
import com.kasperskove.model.SongBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KaraokeMachine {

    private SongBook mSongBook;
    private BufferedReader mReader;
    private Map<String, String> mMenu;

    public KaraokeMachine (SongBook songBook){
        mSongBook = songBook;

        mReader = new BufferedReader(new InputStreamReader(System.in));
        mMenu = new HashMap<String, String>();

        mMenu.put("add", "put another song into the song menu.");
        mMenu.put("quit", "exit the song menu.");
    }

    private String promptAction () throws IOException {

        System.out.printf("There are %d songs avaliable.  Your options are: %n ",
                mSongBook.getSongCount());

        for (Map.Entry<String, String> option : mMenu.entrySet()) {
            System.out.printf("%s - %s %n",
                    option.getKey(),
                    option.getValue());
        }

        System.out.print("What do you want to do?");
        String choice = mReader.readLine();
        return choice.trim().toLowerCase();
    }

    public void run(){
        String choice = "";

        // prompting for choice
        do {
            try {
                choice = promptAction();
                switch (choice) {
                    case "add":
                        Song song = promptNewSong();
                        mSongBook.addSong(song);
                        System.out.printf("%s added %n%n ", song);
                        break;
                    case "quit":
                        System.out.println("Thanks for playing");
                        break;
                    default: System.out.printf("Unknown choice: '%s' %n Try again. %n%n%n", choice);

                }

            } catch (IOException ioe) {
                System.out.printf("Problem with input");
                ioe.printStackTrace();
            }
        } while (!choice.equals("quit"));
    }

    private Song promptNewSong () throws IOException {
        System.out.println("Enter the artists name:  ");
        String artist = mReader.readLine();
        System.out.println("Enter the title:  ");
        String title = mReader.readLine();
        System.out.println("Enter the video URL:  ");
        String videoUrl = mReader.readLine();
        return new Song (artist, title, videoUrl);
    }

    private int promptForIndex(List<String> options) throws IOException {
        int counter = 1;

        for (String option : options) {
            System.out.printf("%d.)  %s %n", counter, option);
            counter++;
        }

        String optionAsString = mReader.readLine();
        int choice = Integer.parseInt(optionAsString.trim());
        System.out.printf("Your choice:    ");
        return choice - 1;
    }
}
