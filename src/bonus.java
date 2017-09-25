import java.util.Scanner;

public class bonus {
    public static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
phone((222),343,434);
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number and character");
//        int number = scan.nextInt();
//        String character = scan.next();
//        for (int num = -1; num < number; num++) {
//            for (int j = -1; j < num; j++) {
//
//                System.out.print(character);
//            }
//            System.out.println();
//        }

    }

    public static int phone(int area, int first, int second) {
        System.out.println("what's your number?");
        int a = Integer.parseInt(scan.next().replaceAll("[()-]", "" ));

        scan.nextInt();
        scan.nextInt();
        System.out.println(area +"" +  first+ "" + second);


        System.out.println("area code is :" + area);
        return (area + first + second);


    }

}





