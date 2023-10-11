package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to RentalCarCalculator");

        System.out.println("Please enter pickupdate : ");
        String pickUpDate = scanner.nextLine();

        double basicCarRental = 29.99;

        System.out.println("Please enter number of days for the rental : ");
        int numDaysForRental = scanner.nextInt();

        double totalBasicRental = basicCarRental * numDaysForRental;
        double electronicTagTotal = numDaysForRental * 3.85;
        double carGpsTotal = numDaysForRental * 2.95;
        double roadsideAssistanceTotal = numDaysForRental * 3.95;
        double underageSubcharge = 30.0 * (29.99 / 100);

        System.out.println("Would you like an electronic toll tage at $3.95/day? ");
        Boolean electronicTollTag = scanner.nextBoolean();

        System.out.println("Would you like a GPS at $2.95/day? ");
        Boolean carGps = scanner.nextBoolean();

        System.out.println("Would you like roadside assistance at $3.95/day? ");
        Boolean roadsideAssistance = scanner.nextBoolean();

        System.out.println("What is your current age? ");
        int clientAge = scanner.nextInt();


        System.out.println("\n RECEIPT");

        if(electronicTollTag && carGps && roadsideAssistance){
            if(clientAge < 25){
                double totalPrice = underageSubcharge + totalBasicRental + electronicTagTotal +
                        carGpsTotal + roadsideAssistanceTotal;
                System.out.println("\n Basic car rental : " + totalBasicRental +
                        "\n Electronic tag cost : " + electronicTagTotal +
                        "\n Car GPS cost : " + carGpsTotal +
                        "\n Roadside assistance cost : " + roadsideAssistanceTotal +
                        "\n Underage driver surcharge : " + underageSubcharge +
                        "\n Your total car rental price is : " + totalPrice);
            }
            else{
                double totalPrice = totalBasicRental + electronicTagTotal + carGpsTotal + roadsideAssistanceTotal;
                System.out.println("\n Basic car rental : " + totalBasicRental +
                        "\n Electronic tag cost : " + electronicTagTotal +
                        "\n Car GPS cost : " + carGpsTotal +
                        "\n Roadside assistance cost : " + roadsideAssistanceTotal +
                        "\n Your total car rental price is : " + totalPrice);
            }
        }
        if(!electronicTollTag && carGps && roadsideAssistance){
            if(clientAge < 25){
                double totalPrice = underageSubcharge + totalBasicRental + carGpsTotal + roadsideAssistanceTotal;
                System.out.println("\n Basic car rental : " + totalBasicRental +
                        "\n Car GPS cost : " + carGpsTotal +
                        "\n Roadside assistance cost : " + roadsideAssistanceTotal +
                        "\n Underage driver surcharge : " + underageSubcharge +
                        "\n Your total car rental price is : " + totalPrice);
            }
            else{
                double totalPrice = totalBasicRental  + carGpsTotal + roadsideAssistanceTotal;
                System.out.println("\n Basic car rental : " + totalBasicRental +
                        "\n Car GPS cost : " + carGpsTotal +
                        "\n Roadside assistance cost : " + roadsideAssistanceTotal +
                        "\n Your total car rental price is : " + totalPrice);
            }
        }
        if(electronicTollTag && !carGps && roadsideAssistance){
            if(clientAge < 25){
                double totalPrice = underageSubcharge + totalBasicRental + electronicTagTotal + roadsideAssistanceTotal;
                System.out.println("\n Basic car rental : " + totalBasicRental +
                        "\n Electronic tag cost : " + electronicTagTotal +
                        "\n Roadside assistance cost : " + roadsideAssistanceTotal +
                        "\n Underage driver surcharge : " + underageSubcharge +
                        "\n Your total car rental price is : " + totalPrice);
            }
            else{
                double totalPrice = totalBasicRental + electronicTagTotal + roadsideAssistanceTotal;
                System.out.println("\n Basic car rental : " + totalBasicRental +
                        "\n Electronic tag cost : " + electronicTagTotal +
                        "\n Roadside assistance cost : " + roadsideAssistanceTotal +
                        "\n Your total car rental price is : " + totalPrice);
            }
        }
        if(electronicTollTag && carGps && !roadsideAssistance){
            if(clientAge < 25){
                double totalPrice = underageSubcharge + totalBasicRental + electronicTagTotal + carGpsTotal;
                System.out.println("\n Basic car rental : " + totalBasicRental +
                        "\n Electronic tag cost : " + electronicTagTotal +
                        "\n Car GPS cost : " + carGpsTotal +
                        "\n Underage driver surcharge : " + underageSubcharge +
                        "\n Your total car rental price is : " + totalPrice);
            }
            else{
                double totalPrice = totalBasicRental + electronicTagTotal + carGpsTotal;
                System.out.println("\n Basic car rental : " + totalBasicRental +
                        "\n Electronic tag cost : " + electronicTagTotal +
                        "\n Car GPS cost : " + carGpsTotal +
                        "\n Your total car rental price is : " + totalPrice);
            }
        }
        if(!electronicTollTag && !carGps && !roadsideAssistance){
            if(clientAge < 25){
                double totalPrice = underageSubcharge + totalBasicRental;
                System.out.println("\n Basic car rental : " + totalBasicRental +
                        "\n Underage driver surcharge : " + underageSubcharge +
                        "\n Your total car rental price is : " + totalPrice);
            }
            else{
                double totalPrice = totalBasicRental;
                System.out.println("\n Basic car rental : " + totalBasicRental +
                        "\n Your total car rental price is : " + totalPrice);
            }
        }
        if(!electronicTollTag && !carGps && roadsideAssistance){
            if(clientAge < 25){
                double totalPrice = underageSubcharge + totalBasicRental + roadsideAssistanceTotal;
                System.out.println("\n Basic car rental : " + totalBasicRental +
                        "\n Roadside assistance cost : " + roadsideAssistanceTotal +
                        "\n Underage driver surcharge : " + underageSubcharge +
                        "\n Your total car rental price is : " + totalPrice);
            }
            else{
                double totalPrice = totalBasicRental + roadsideAssistanceTotal;
                System.out.println("\n Basic car rental : " + totalBasicRental +
                        "\n Roadside assistance cost : " + roadsideAssistanceTotal +
                        "\n Your total car rental price is : " + totalPrice);
            }
        }
        if(!electronicTollTag && carGps && !roadsideAssistance){
            if(clientAge < 25){
                double totalPrice = underageSubcharge + totalBasicRental + carGpsTotal;
                System.out.println("\n Basic car rental : " + totalBasicRental +
                        "\n Car GPS cost : " + carGpsTotal +
                        "\n Underage driver surcharge : " + underageSubcharge +
                        "\n Your total car rental price is : " + totalPrice);
            }
            else{
                double totalPrice = totalBasicRental + carGpsTotal;
                System.out.println("\n Basic car rental : " + totalBasicRental +
                        "\n Car GPS cost : " + carGpsTotal +
                        "\n Your total car rental price is : " + totalPrice);
            }
        }
        if(electronicTollTag && !carGps && !roadsideAssistance){
            if(clientAge < 25){
                double totalPrice = underageSubcharge + totalBasicRental + electronicTagTotal;
                System.out.println("\n Basic car rental : " + totalBasicRental +
                        "\n Electronic tag cost : " + electronicTagTotal +
                        "\n Underage driver surcharge : " + underageSubcharge +
                        "\n Your total car rental price is : " + totalPrice);
            }
            else{
                double totalPrice = totalBasicRental + electronicTagTotal;
                System.out.println("\n Basic car rental : " + totalBasicRental +
                        "\n Electronic tag cost : " + electronicTagTotal +
                        "\nYour total car rental price is : " + totalPrice);
            }
        }
    }
}
