package app;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an operation");
        System.out.println("1) Converting miles to kilometers");
        System.out.println("2) Converting kilometers to miles");
        System.out.println("3) Exit converter");

        while(true){
            Integer operation = scanner.nextInt();
            if (operation.equals(3)) {
                System.out.println("Exiting converter. Goodbye!");
                break;
            } else if (operation.equals(1)) {
                System.out.println("Write count miles for converting to kilometers");
                double data = scanner.nextDouble();
                double result = calculation(data, operation);
                System.out.println(result + " kilometers");
            } else if (operation.equals(2)) {
                System.out.println("Write count kilometers for converting to miles");
                double data = scanner.nextDouble();
                double result = calculation(data, operation);
                System.out.println(result + " miles");
            } else {
                System.out.println("Incorrect operation");
            }

        }
        scanner.close();
    }

    private static double calculation(double data, int operation) {
        switch (operation) {
            case 1:
                return data * 1.609344;
            case 2:
                return data / 1.609344;
            default:
                throw new IllegalArgumentException("Incorrect operation");
        }
    }
}
