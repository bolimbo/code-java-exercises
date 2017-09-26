package util;

import java.util.Scanner;

public class Input {
    private static Scanner scan = new Scanner(System.in);


    String getString(String str) {
        System.out.println("enter a string");
        String strn = scan.nextLine();
        return strn;

    }

    public boolean yesNo() {
        System.out.println("is yes or no?");
        String str = scan.nextLine();
        return  str.equalsIgnoreCase("yes");

    }



    public int getInt() {
        if (this.scan.hasNextInt()) {
            return this.scan.nextInt();
        } else {
            System.out.println("Invalid input");
            return getInt();
        }
    }

    public int getInt(int min, int max) {
      int userInput = getInt();
        if (userInput < min || userInput > max){
        System.out.println(userInput + " is not bwtween " +  min + " and " + max);
        return getInt(min,max);
}
       return userInput;
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


    public double getDouble() {
 if (this.scan.hasNextDouble()){
 return this.scan.nextDouble();
    } else {
     System.out.println("that s not a double try again");
 }
        return getDouble();
    }


    public static void main(String[] args) {
        Input input = new Input();
        input.getInt(0, 100);
        System.out.println("number entered " + input.getInt());
        input.getDouble(0.0, 100.0);
        input.getDouble();
        input.yesNo();
        input.getString("carlo");
    }
}