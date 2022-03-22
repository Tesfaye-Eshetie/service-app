package com.tesfayeeshetie;

public class Music extends ServiceCommunicator{

    Music(String songTitleOrArtistName){
        super("https://itunes.apple.com/search?term=" + songTitleOrArtistName + "&limit=1");
    }

    public static void main(String[] args) {
        Music song = new Music("TEDDY-AFRO");
        song.connect();
        System.out.println(song.get());
    }
}
