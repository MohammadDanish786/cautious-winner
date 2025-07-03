package org.example;


import java.util.Scanner;

    public class Reverse {

        public static void main(String[] args) {


            int num = 23456;
            int sum = 0;

            while (num > 0) {

             int rem = num % 10 ;
                num = num /10;
                sum =  sum * 10 + rem;

            }
            System.out.println(sum);

        }
    }
