package org.example;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the fruit name (e.g., Mango, Orange, Banana):");
        String fruit = sc.nextLine().trim();  // Handles extra spaces and full line

        System.out.println("Enter the price ID (e.g., 1 or 2):");
        int price = sc.nextInt();

        switch (fruit.toLowerCase()) {  // Make switch case-insensitive
            case "mango" -> System.out.println("Fruit King 🍋");
            case "orange" -> System.out.println("Tangy Flavour 🍊");
            case "banana" -> {
                System.out.println("Long Fruit 🍌");

                // Nested switch for Banana price
                switch (price) {
                    case 1 -> System.out.println("40 Rs per kilo");
                    case 2 -> System.out.println("10 Rs per kilo");
                    default -> System.out.println("Unknown price ID for Banana");
                }
            }
            default -> System.out.println("Unknown fruit: " + fruit);
        }
    }
}
