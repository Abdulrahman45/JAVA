package com.firestprogram;

import java.util.Scanner;

public class math_operation {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        //java math operation
        System.out.println("Enter_number_A :");
        int a=reader.nextInt();
        System.out.println("Enter_number_B");
        int b=reader.nextInt();
        int sum=a + b;
        int m = a * b;
        int on = a / b;

        System.out.println("the_sum ="+sum);
        System.out.println("the_multiplication ="+m);
        System.out.println("the_quotient ="+on);

    }

}
