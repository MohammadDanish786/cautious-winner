package org.example;

import java.util.Arrays;

public class variables {

    public static void main(String[] args) {

                   fun(1,2,3,4,5,6);

    }
        static void fun(int ...a){
            System.out.println((Arrays.toString(a)));
        }

    }
