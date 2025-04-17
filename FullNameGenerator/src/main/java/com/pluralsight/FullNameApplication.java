package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner firstName = new Scanner(System.in);
        System.out.println("Enter your first name");
        String first = firstName.nextLine().trim();

        Scanner middleName = new Scanner(System.in);
        System.out.println("Enter your middle name");
        String middle = middleName.nextLine().trim();

        Scanner lastName = new Scanner(System.in);
        System.out.println("Enter your last name");
        String last = lastName.nextLine().trim();

        System.out.println("Full name: " + first +" "+ middle + " " + last);

    }
}
