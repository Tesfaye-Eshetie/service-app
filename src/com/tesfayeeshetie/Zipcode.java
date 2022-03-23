package com.tesfayeeshetie;

import java.util.Scanner;

public class Zipcode extends ServiceCommunicator {

    public Zipcode(String zipcode) {
        super ("http://api.zippopotam.us/us/"+ zipcode);
    }

    public static void getZip (String inputZipcode) {
        Zipcode zip = new Zipcode(inputZipcode);
        zip.connect();
        System.out.println(zip.get());
    }
}
