package app;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an operation");
        System.out.println("1) Converting miles to kilometers");
        System.out.println("3) Exit converter");

        while(true){
            Integer operation = scanner.nextInt();
            if (operation.equals(3)) {
                System.out.println("Exiting converter. Goodbye!");
                break;
            } else if (operation.equals(1)) {
                System.out.println("Write count miles for converting to kilometers");
                Integer data = scanner.nextInt();
                double result = calculation(data, operation);
                System.out.println(result + " kilometers");
            } else {
                System.out.println("Incorrect operation");
            }
        }
        scanner.close();
    }

    private static double calculation(int data, int operation) {
        switch (operation) {
            case 1:
                return data * 1.609344;
            default:
                throw new IllegalArgumentException("Incorrect operation");
        }
    }
}
