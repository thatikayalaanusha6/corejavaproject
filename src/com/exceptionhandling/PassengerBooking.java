package com.exceptionhandling;

import java.util.Scanner;

public class PassengerBooking {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

        System.out.println("===== Passenger Booking System =====");
        System.out.print("Enter Passenger ID: ");
        String passengerId = sc.nextLine();

        System.out.print("Enter Passenger Age: ");
        String age = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        String seatNumber = sc.nextLine();

        System.out.print("Enter Number of Passengers: ");
        int numberOfPassengers = sc.nextInt();

       
        String[] passengers = {
            "Anusha",
            "Divya",
            "Shajina",
            "Shilpa"
        };

        // Different passenger data using Object[]
        Object[] passengerData = {
            "Anusha",
            21,
            4500.50
        };
        try {
            int id = Integer.parseInt(passengerId);
            int passengerAge = Integer.parseInt(age);

            System.out.println("\nPassenger ID: " + id);
            System.out.println("Passenger Age: " + passengerAge);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid ID or Age.");
        }
        try {
            double totalBaggage = 60.0;

            double averageBaggage =
                    totalBaggage / numberOfPassengers;

            System.out.println("Average Baggage: "
                    + averageBaggage);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }

        try {
            System.out.print("Enter passenger array index: ");
            int index = sc.nextInt();

            System.out.println("Passenger: " + passengers[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "ArrayIndexOutOfBoundsException: Invalid passenger index.");
        }
        try {
            System.out.println("Third character of seat number: "
                    + seatNumber.charAt(2));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println(
                "StringIndexOutOfBoundsException: Seat number is too short.");
        }
        try {
            Integer value = (Integer) passengerData[0];

            System.out.println("Passenger Data: " + value);
        }
        catch (Exception e) {
            System.out.println(
                "ClassCastException: Object cannot be converted to Integer.");
        }
        try {
            String passengerName = null;

            System.out.println("Passenger name length: "
                    + passengerName.length());
        }
        catch (NullPointerException e) {
            System.out.println(
                "NullPointerException: Passenger data is null.");
        }
        try {
            double totalAmount = 10000.0;
            int totalSeats = numberOfPassengers;

            double bookingAverage =
                    totalAmount / totalSeats;

            System.out.println("Booking Average: "
                    + bookingAverage);
        }
        catch (ArithmeticException e) {
            System.out.println(
                "ArithmeticException: Number of seats cannot be zero.");
        }
        System.out.println("\nBooking processing completed.");
        System.out.println("Program continues successfully.");

        sc.close();
    }
}