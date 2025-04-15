package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        Scanner sizeScanner = new Scanner(System.in);
        System.out.println("welcome Pick your sandwich size");
        System.out.println("1-Reg 2-large");
        System.out.println("$5.45  $8.95");
        int size = sizeScanner.nextInt();

        Scanner ageScanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = ageScanner.nextInt();

        double discount = 0;
        if (age <= 17) {
            discount = .10;
        } else if (age >= 65) {
            discount = .20;
        }
        double price = 0;
        if (size == 1) {
            price = 5.45 * (1 - discount);
        }
        else if (size == 2) {
            price = 8.95 * (1 - discount);
        }
            System.out.println("The total will be before tax is: " + price);

    }
}