package com.tesfayeeshetie;

public class Zipcode extends ServiceCommunicator {

    public Zipcode(String zipcode) {
        super ("http://api.zippopotam.us/us/"+ zipcode);
    }
    public static void main(String[] args) {
        Zipcode zip = new Zipcode("27560");
        zip.connect();
        System.out.println(zip.get());
    }
}
