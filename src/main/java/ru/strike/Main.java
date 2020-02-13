package ru.strike;

public class Main {

    public static void main(String[] args) throws Exception {


        System.out.println("Profile: " + ProfileUtil.getProfile());

        MyInterfaceFactory.getMyInterface().doIt();

    }

}
