package com.interfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone danielsPhone;
        danielsPhone = new DeskPhone(123456);

        danielsPhone.powerOn();
        danielsPhone.dial(123456);

        danielsPhone = new MobilePhone(23464);
        danielsPhone.powerOn();
        danielsPhone.callPhone(23464);
        danielsPhone.answer();
    }
}
