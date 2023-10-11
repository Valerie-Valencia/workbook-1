package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int firstInteger = scanner.nextInt();

        System.out.println("Enter a second integer: ");
        int secondInteger = scanner.nextInt();

        System.out.println("Please select an Option\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide\n");
        char userInput = scanner.next().charAt(0);

        if(userInput == 'A'){

            System.out.println(firstInteger + " " + "+" + " " + secondInteger + " " + "=" + " " +
                    addIntegers(firstInteger, secondInteger));
        }
        else if(userInput == 'S') {

            System.out.println(firstInteger + " " + "-" + " " + secondInteger + " " + "=" + " " +
                    subtractIntegers(firstInteger, secondInteger));
        }
        else if(userInput == 'M'){

            System.out.println(firstInteger + " " + "*" + " " + secondInteger + " " + "=" + " " +
                    multiplyIntegers(firstInteger, secondInteger));

        }
        else if(userInput == 'D'){

            System.out.println(firstInteger + " " + "/" + " " + secondInteger + " " + "=" + " " +
                    divideIntegers(firstInteger, secondInteger));

        }
        else{
            System.out.println("Input invalid.");
        }

    }

    public static int addIntegers(int a, int b){

        return a + b;

    }

    public static int subtractIntegers(int a, int b){

        return a - b;

    }
    public static int multiplyIntegers(int a, int b){

        return a * b;

    }

    public static int divideIntegers(int a, int b){

        return a / b;

    }
}
