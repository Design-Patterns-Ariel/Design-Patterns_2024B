package Singleton;

import Singleton.Java.Singleton;

public class Main {


    public static void main(String[] args) {
        // db = new db("")
        for (int i = 0; i < 10; i++) {
            System.out.println(Singleton.getInstance());
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(Singleton.egetInstance());
        }
    }
}
