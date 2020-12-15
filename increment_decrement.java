package com.firestprogram;

import java.util.Scanner;

public class increment_decrement {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a=5;
        int b=5;
        int x=a+ ++b;
        //int x=a+ b++;
        System.out.println(x);
    }
}
