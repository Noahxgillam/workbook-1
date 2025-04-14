package com.pluralsight;

import java.util.Scanner;

import static java.lang.System.*;

public class MathApp {

    public static void main(String[] args) {
       /* double bobSalary = 50_000;
        double garySalary = 200_000.99;


        double highestsalary = Math.max(bobSalary, garySalary);


        System.out.println("highest salary is: " + highestsalary);
    
        double carPrice = 2005.24;
        double truckPrice = 3002.23;
        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("lowest price is: " + lowestPrice);

        double pi = 3.14;
        double circleRadius =7.25;

        double circleArea = pi * Math.pow(circleRadius, 2);

        System.out.println("the circle area is: " + circleArea);

        double squareRoot = 5.0;
        double answer = Math.sqrt(5.0);
        System.out.println("The answer is: " + answer);


        double first1 = 5;
        double first2 = 10;
        double second1 = 85;
        double second2 = 50;

        double difference = second1 - first1;
        Math.pow(difference,2);

        System.out.println("The difference is: " + Math.pow(difference,2));*/

        Scanner scanner = new Scanner(in);
        out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        out.println("Pick an option");

        out.println("a=Add");
        out.println("m=Multiply");
        out.println("s=Subtragct");
        out.println("d=divide");

        Scanner optScanner = new Scanner(in);
        out.print("Enter an option: ");
        String optM = optScanner.nextLine();
        if (optM == "m") {
            Math.multiplyExact(num1, num2);
        }
            out.print("The answer is: " + num1 + " X " + num2 + " = " + (Math.multiplyExact(num1, num2)));
        /*else{
            out.println("Invald input");
        }*/
    }
}
