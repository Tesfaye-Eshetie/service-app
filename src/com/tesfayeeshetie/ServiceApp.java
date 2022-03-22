package com.tesfayeeshetie;

import java.util.Scanner;

import static com.tesfayeeshetie.Music.getMusic;
import static com.tesfayeeshetie.Television.getShow;
import static com.tesfayeeshetie.Zipcode.getZip;

public class ServiceApp {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.print("Cmd> ");
            String request = userInput.next();

            switch (request) {
                case "zipcode" -> {
                    System.out.println("Inter a zipcode?");
                    String inputZipcode = userInput.next();
                    getZip(inputZipcode);
                    break;
                }
                case "television", "tv" -> {
                    System.out.println("What show you like to watch today?");
                    String inputTVShow = userInput.next();
                    getShow (inputTVShow);
                    break;
                }
                case "music" -> {
                    System.out.println("Inter title of song or artist name to listen to the music?");
                    String inputTitleOrArtistName = userInput.next();
                    getMusic (inputTitleOrArtistName);
                    break;
                }
                default -> {
                    System.exit(0);
                }
            }
        }

    }
}
