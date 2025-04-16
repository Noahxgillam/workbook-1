package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {

    public static void main(String[] args) {

        Scanner dateScanner = new Scanner(System.in);
        System.out.println("Enter your pickup date");
        String date = dateScanner.nextLine();

        Scanner daysScanner = new Scanner(System.in);
        System.out.println("How many days you want to rent? \n Each day cost 29.99");
        int days = daysScanner.nextInt();

        Scanner tagScanner = new Scanner(System.in);
        System.out.println("Add electronic toll tag at $3.95/day? yes/no");
        String tag = tagScanner.nextLine().trim();

        Scanner gpsScanner = new Scanner(System.in);
        System.out.println("Add a GPS at $2.95/day? yes/no");
        String gps = gpsScanner.nextLine().trim();

        Scanner roadScanner = new Scanner(System.in);
        System.out.println("Add roadside assistance $3.95/day? yes/no");
        String road = roadScanner.nextLine().trim();

        Scanner ageScanner = new Scanner(System.in);
        System.out.println("There is a 30% surcharge for drivers under 25 \n Enter your age");
        int age = ageScanner.nextInt();

        double price = 29.99 * days;
        double tagp = 3.95 * days;
        double gpsp = 2.95 * days;
        double roadp = 3.95 * days;

        double sur = 0;
        double total = 0;
        double fullp = (price+ (tag.equals("yes") ? tagp : 0.0) + (gps.equals("yes") ? gpsp : 0.0) + (road.equals("yes") ? roadp : 0.0));
        if (age < 25) {
            total = fullp * 1.30;
        }
          else{
              total = fullp * 1;
            }
        sur = total - fullp;
        System.out.println("The Total price will be " + total);
        System.out.println( "Your pick up date will be: " + date);
        System.out.println( "The surcharge will be: " + sur);


    }
}
