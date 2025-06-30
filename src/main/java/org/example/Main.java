package org.example;


import java.util.Scanner;

    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
    public class Main {
        public static void main(String[] args) {
//        System.out.println("Enter ch");
//        Scanner sc = new Scanner(System.in);
//        char ch = sc.next().trim().charAt(0);
//
//        if(ch >= 'a' && ch <= 'z') {
//            System.out.println("Char is in lower case");
//        } else{
//                System.out.println("Char is in Upper Case");
//            }


            System.out.println("Enter the number");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a = 0;
            int b = 1;
            int count = 2;
            while (count <= n) {

                int temp = b;
                b = a + b;
                a = temp;
                count++;
            }
            System.out.println(b);
        }
    }