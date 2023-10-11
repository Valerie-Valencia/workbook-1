package com.pluralsight;

import java.util.Scanner;

public class MathApp {

    public static void main(String[] args){

       /*

        double pricePerPound;
        pricePerPound = 1.5;
        int poundsOfPotatoes;
        poundsOfPotatoes = 10;
        double totalPrice;
        totalPrice = pricePerPound * poundsOfPotatoes;

      System.out.printf("%8.2f\n", totalPrice);
      System.out.printf("%9.3f\n", totalPrice);
      System.out.printf("%10.4f\n", totalPrice);


      System.out.printf("Your value is $ %8.2f %8.3f", totalPrice, totalPrice2);
      System.out.println(totalPrice);


      System.out.println("""
       Hello, my name is O'Leary
                I come
                from the
                GREAT
                STATE
                of
                New York!!!
              """);

      */

      double bobSalary;
      bobSalary = 103098;
      double garySalary;
      garySalary = 104000;
      double highestSalary;
      highestSalary = Math.max(bobSalary, garySalary);

      System.out.println("The highest salary is ..." + highestSalary);

      double carPrice;
      carPrice = 3200;
      double truckPrice;
      truckPrice = 15000;
      double lowestPrice;
      lowestPrice = Math.min(carPrice, truckPrice);

      System.out.println("The lowest price is ..." + lowestPrice);

      double radius;
      radius = 7.25;
      double circleArea;
      circleArea = 3.14 * Math.pow(radius, 2);

      System.out.println("Area of the circle is ..." + circleArea);

      double bookRating;
      bookRating = 5.0;
      double ratingSquareRoot;
      ratingSquareRoot = Math.sqrt(bookRating);

      System.out.println("The square root of 5.0 is ..." + ratingSquareRoot);

      //double distance = 0.0;
      //distance = Math.sqrt(Math.pow(85.0 - 5.0, 2.0) + Math.pow(50.0 - 10.0, 2.0));

      double distance = calculatedDistanceBetween(85.0, 5.0, 50.0, 10.0);

      System.out.println("The distance between points (5, 10) and (85,50) is ..." + distance);
      System.out.printf("Distance = %5.2f\n", distance);

      Scanner scanner = new Scanner(System.in);

      //System.out.println("PLease enter a floating-point number: ");
      double inputValue = promptAndReturnDouble("Please enter a floating-poiint number");
      //System.out.println(inputValue);
      //clear the input buffer
      //scanner.nextLine();
      //System.out.println(inputValue);

      System.out.println("Please enter your name: ");
      // this will expect the user to input to
      String inputString = scanner.nextLine();
      System.out.println(inputString);

      if(inputString.equals("Paul")){
        System.out.println("Go away, paul");
      }
      else {
        System.out.println("Hello " + inputString);
      }

      return; //unnecessary to type, but demonstrates that "void" methods, returns nothing

    }

    public static double calculatedDistanceBetween(double x2, double x1, double y2, double y1){

      //double distance = 0.0;

      return Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));

  };

    public static double promptAndReturnDouble(String prompt){

      double value;
      Scanner scanner = new Scanner(System.in);
      System.out.print(prompt + " : ");
      value = scanner.nextDouble();
      scanner.nextLine(); // clears the input buffer
      return value;

    };

}
