package com.tesfayeeshetie;

import java.util.Scanner;

public class ServiceApp {

    public static void main(String[] args) {

        Zipcode zip = new Zipcode("23238");
        Music song = new Music("TEDDY-AFRO");
        Television TV = new Television("atlanta");

        Scanner userInput;

        while (true) {
            System.out.print("Cmd> ");
            userInput = new Scanner(System.in);
            String request = userInput.next();

            switch (request) {
                case "zipcode" -> {
                    zip.connect();
                    System.out.println(zip.get());
                }
                case "television", "tv" -> {
                    TV.connect();
                    System.out.println(TV.get());
                }
                case "music" -> {
                    song.connect();
                    System.out.println(song.get());
                }
                default -> {
                    System.exit(0);
                }
            }
        }

    }
}
