package app;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an operation");
        System.out.println("1) Converting miles to kilometers");
        System.out.println("Enter 'exit' to end the converter");

        while(true){
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting converter. Goodbye!");
                break;
            }
        }
    }
}
