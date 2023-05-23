package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max) {
        int num;
        do {
            System.out.printf("Please enter an integer between %d and %d: ", min, max);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            num = scanner.nextInt();
            scanner.nextLine();
        } while (num < min || num > max);
        return num;
    }

    public int getInt() {
        System.out.print("Please enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
        }
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    public double getDouble(double min, double max) {
        double num;
        do {
            System.out.printf("Please enter a decimal number between %.2f and %.2f: ", min, max);
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a decimal number.");
                scanner.next();
            }
            num = scanner.nextDouble();
            scanner.nextLine();
        } while (num < min || num > max);
        return num;
    }

    public double getDouble() {
        System.out.print("Please enter a decimal number: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a decimal number.");
            scanner.next();
        }
        double num = scanner.nextDouble();
        scanner.nextLine();
        return num;
    }

    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Enter a string: ");
        String str = input.getString();
        System.out.println("You entered: " + str);

        System.out.print("Enter yes or no: ");
        boolean answer = input.yesNo();
        System.out.println("Your answer is: " + answer);

        int min = 1;
        int max = 10;
        int num = input.getInt(min, max);
        System.out.println("Valid integer between " + min + " and " + max + ": " + num);

        int anyNum = input.getInt();
        System.out.println("Any integer: " + anyNum);

        double doubleMin = 0.5;
        double doubleMax = 2.5;
        double decimalNum = input.getDouble(doubleMin, doubleMax);
        System.out.println("Valid decimal number between " + doubleMin + " and " + doubleMax + ": " + decimalNum);

        double anyDecimalNum = input.getDouble();
        System.out.println("Any decimal number: " + anyDecimalNum);
    }
}
