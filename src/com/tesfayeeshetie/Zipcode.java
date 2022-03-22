package com.tesfayeeshetie;

import java.util.Scanner;

public class Zipcode extends ServiceCommunicator {

    public Zipcode(String zipcode) {
        super ("http://api.zippopotam.us/us/"+ zipcode);
    }
    public static void main(String[] args) {
        Scanner inputZip = new Scanner(System.in);
        System.out.println("Inter a zip code?");
        String inputZipcode = inputZip.next();
        Zipcode zip = new Zipcode(inputZipcode);
        zip.connect();
        System.out.println(zip.get());
    }
}
