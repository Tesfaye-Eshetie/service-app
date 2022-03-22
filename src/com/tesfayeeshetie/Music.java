package com.tesfayeeshetie;

import java.util.Scanner;

public class Music extends ServiceCommunicator{

    Music(String songTitleOrArtistName){
        super("https://itunes.apple.com/search?term=" + songTitleOrArtistName + "&limit=1");
    }

    public static void main(String[] args) {
        Scanner inputMusic = new Scanner(System.in);
        System.out.println("Inter title of song or artist name to listen to the music?");
        String inputTitleOrArtistName = inputMusic.next();
        Music song = new Music(inputTitleOrArtistName);
        song.connect();
        System.out.println(song.get());
    }
}
