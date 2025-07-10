package org.example;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        Boolean prime = isPrime(num);
        System.out.println(prime);

    }

    static Boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int c = 2; c * c <= num; c++) {
            if (num % c == 0)
                return false;
        }
        return true;
    }


}