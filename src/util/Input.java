package util;

import java.util.Scanner;

public class Input {
    private static Scanner scan = new Scanner(System.in);


    public String getString(String str) {
        System.out.println(str);
        String strn = scan.nextLine();
        return strn;

    }

    public boolean yesNo() {
        System.out.println("continue y/n?");
        String str = scan.nextLine();
        return  str.equalsIgnoreCase("y");

    }

    public int getInt()  {
        System.out.println("get integer?");
        String a = scan.nextLine();
        try{
            System.out.println(a);
            return Integer.valueOf(a);
        }catch (NumberFormatException e){
            System.out.println("Invalid Input");
            return getInt();
        } catch (Exception e){
            System.out.println("Invalid Input");
            return getInt();
        }
    }

    public int getInt(int min, int max) throws Exception {
      int userInput = getInt();
        if (userInput < min || userInput > max){
        System.out.println(userInput + " is not between " +  min + " and " + max);
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


    public double getDouble() throws NumberFormatException {
        System.out.println("get Decimal?");

      String  b = scan.nextLine();

        try{
            System.out.println(b);
            return Double.valueOf(b);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println(e + "not a decimal");
            return getDouble();
        }
        catch (Exception e){
            System.out.println("not an valid decimal");
            return getDouble();
        }
    }


    public static void main(String[] args) throws Exception {
        Input input = new Input();
        input.getInt(0, 100);
//        System.out.println("number entered " + input.getInt());
//        input.getDouble(0.0, 100.0);
        input.getDouble();
//        input.yesNo();
//        input.getString("carlo");
        int x = 5 * 4 % 3;
        System.out.println();

    }

}