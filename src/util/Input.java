package util;

import java.util.Scanner;

public class Input {
    private static Scanner scan = new Scanner(System.in);


    String getString(String str) {
        System.out.println("enter a string");
        String strn = scan.next();
        return strn;

    }

    public boolean yesNo() {
        System.out.println("is yes or no?");
        String str = scan.next();
        if (str.equalsIgnoreCase("yes")) {
            return true;
        } else if (str.equalsIgnoreCase("no")) {
            return false;
        }
        return false;
    }


    public int getInt(int min, int max) {
        int str1;
        do {
            System.out.println("enter integer between " + min + " " + max);
            str1 = scan.nextInt();
            if (str1 < min || str1 > max) {
                System.out.println("not valid ");
            }
        } while (str1 < min || str1 > max);
        return str1;
    }


    public int getInt(int n) {
        System.out.println("enter a number");
        n = scan.nextInt();
        return n;
    }

    public double getDouble(double min, double max) {
        double str2;
        do {
            System.out.println("enter integer between " + min + " " + max);
            str2 = scan.nextDouble();
            if (str2 < min || str2 > max) {
                System.out.println("number not in range");
            }
        } while (str2 < min || str2 > max);
        return str2;

    }


    public double getDouble(double n) {
        System.out.println("enter a decimal");
        scan.nextLine();
        n = scan.nextDouble();
        return n;
    }


    public static void main(String[] args) {
        Input input = new Input();
        input.getInt(0, 100);
        System.out.println("number entered " + input.getInt(3));
        input.getDouble(0.0, 100.0);
        input.getDouble(100.0);
        input.yesNo();
        input.getString("carlo");
    }
}