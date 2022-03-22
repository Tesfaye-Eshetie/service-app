package com.tesfayeeshetie;

public class Television extends ServiceCommunicator {

    Television( String tvShowName) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + tvShowName);
    }

    public static void main(String[] args) {
        Television TV = new Television("atlanta");
        TV.connect();
        System.out.println(TV.get());
    }
}
