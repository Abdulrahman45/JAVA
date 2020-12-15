package com.firestprogram;

import java.util.Scanner;

public class scanner_input {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("welcome");
        System.out.println("enter name :");
        String log = reader.nextLine();
        System.out.println("your log :"+log);
    }

}
