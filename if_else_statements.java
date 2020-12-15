package com.firestprogram;

import java.util.Scanner;

public class if_else_statements {
    static Scanner reader= new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter_number_wight :");
        int wight=reader.nextInt();
        if(wight>=70){
            System.out.println("you are fat");
        }
        else{
            System.out.println("you are slem");
        }
    }
}
