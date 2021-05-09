package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("How many stars do you like to print: ");
        int numbers = in.nextInt();
        for(int i = 1; i <= numbers; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = numbers - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
