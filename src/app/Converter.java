package app;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args){
        init();
    }

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an operation \n 1) Converting miles to kilometers \n 2) Converting kilometers to miles \n 3) Exit converter");

        while (true) {
            try {
                int operation = scanner.nextInt();
                switch (operation) {
                    case 1: {
                        System.out.println("Write count miles for converting to kilometers");
                        double data = scanner.nextDouble();
                        double result = calculation(data, operation);
                        System.out.println(result + " kilometers");
                    }
                    case 2: {
                        System.out.println("Write count kilometers for converting to miles");
                        double data = scanner.nextDouble();
                        double result = calculation(data, operation);
                        System.out.println(result + " miles");
                    }
                    case 3: {
                        System.out.println("Exiting converter. Goodbye!");
                        break;
                    }
                    default: {
                        System.out.println("Incorrect operation");
                    }
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
            scanner.close();
        }
    }

    private static double calculation(double data, int operation) {
        return switch (operation) {
            case 1 -> data * 1.609344;
            case 2 -> data / 1.609344;
            default -> throw new IllegalArgumentException("Incorrect operation");
        };
    }

}
