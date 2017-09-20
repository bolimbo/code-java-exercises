import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        System.out.println(i);
//        while(i < 15){
//            i++;
//            System.out.println(i);
//
//        }

//        int i = 0;
//        do {
//            System.out.println("iteration");
//            System.out.println(i);
//            i += 2;
//
//        } while (i <= 100);
//
//        long k = 2;
//
//        do {
//            System.out.println(k);
//            k *= k;
//        } while (k < 1000000);
//
//for (int i = 1;i <= 100;  i++) {
//    System.out.println(i);
//    if( i % 3 == 0 && i % 5 == 0) {
//        System.out.println(i +"FizzBuzz");
//    } else if(i % 3 ==0){
//        System.out.println(i + "Fizzz");
//
//    } else if( i % 5 == 0) {
//        System.out.println(i + "Buzz");
//    }
//}

Scanner scan = new Scanner(System.in);
System.out.println("Enter a number: ");
        System.out.println ("Number   Square   Cube");
        System.out.printf ("%d        %d        %d\n", 0, (0 * 0), (0 * 0 * 0));
        System.out.printf ("%d        %d        %d\n", 1, (1 * 1), (1 * 1 * 1));
        System.out.printf ("%d        %d        %d\n", 2, (2 * 2), (2 * 2 * 2));
        System.out.printf ("%d        %d        %d\n", 3, (3 * 3), (3 * 3 * 3));
        System.out.printf ("%d        %d       %d\n", 4, (4 * 4), (4 * 4 * 4));
        System.out.printf ("%d        %d       %d\n", 5, (5 * 5), (5 * 5 * 5));
        System.out.printf ("%d        %d       %d\n", 6, (6 * 6), (6 * 6 * 6));
        System.out.printf ("%d        %d       %d\n", 7, (7 * 7), (7 * 7 * 7));
        System.out.printf ("%d        %d       %d\n", 8, (8 * 8), (8 * 8 * 8));
        System.out.printf ("%d        %d       %d\n", 9, (9 * 9), (9 * 9 * 9));
        System.out.printf ("%d       %d      %d\n", 10, (10 * 10), (10 * 10 * 10));


        Scanner grade = new Scanner(System.in);
        String str;
        do {

            System.out.println("enter you grade");

            int score = grade.nextInt();

            if (score >= 88 && score <= 100) {
                System.out.println("you got an A");
            } else if (score >= 80 && score <= 87) {
                System.out.println("you got a B");
            } else if (score >= 67 && score <= 79) {
                System.out.println("you got a C");


            } else if (score >= 60 && score <= 66) {
                System.out.println("you got a D");

            } else if (score >= 0 && score <= 60) {
                System.out.println("you got an F");
            } else {
                System.out.println("Invalid Score");

            }

            System.out.println("continue?");
            str = grade.next();
        } while (str.equalsIgnoreCase("y"));

    }
}

