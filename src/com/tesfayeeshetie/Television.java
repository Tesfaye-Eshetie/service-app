package com.tesfayeeshetie;

import java.util.Scanner;

public class Television extends ServiceCommunicator {

    Television( String tvShowName) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + tvShowName);
    }

    public static void main(String[] args) {
        Scanner inputShow = new Scanner(System.in);
        System.out.println("What show you like to watch today?");
        String inputTVShow = inputShow.next();
        Television TV = new Television(inputTVShow);
        TV.connect();
        System.out.println(TV.get());
    }
}
