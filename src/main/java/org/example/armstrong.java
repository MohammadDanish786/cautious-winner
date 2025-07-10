package org.example;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println( armstrong(num));

    }

    static Boolean armstrong(int num) {
        int orignal = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem * rem * rem;

        }
        if (sum == orignal) return true;
        else return false;
    }
}