import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

    public static Scanner scan = new Scanner(System.in);

    public static Random random = new Random();


    public static void main(String[] args) {

        String another;


        addition(5, 5);
        substraction(9, 5);
        multiplication(10, 4);
        division(40, 2);
        modulus(6, 2);
        factor(5);
        game101(scan);


        System.out.println("provide the number of sides ");
        rollDice(getInteger(1,10, scan),scan);
//        giveRamdon(100);
//        rollDice();
//
//        askUser("number of sides?");


// DO WHILE LOOP FOR FACTORIAL METHOD
        do {
            long userInput = getInteger(0, 100, scan);

            long factorial = getFactorial(userInput);
            System.out.println(factorial);

            System.out.println("Another Factorial?");
            another = scan.next();

        } while (another.equalsIgnoreCase("y"));

    }

//    END OF FACTORIAL METHOD

//   BASIC ARITHMETIC

    public static double addition(double a, double b) {
        System.out.println(a + b);
        return a + b;
    }

    public static double substraction(double c, double d) {
        System.out.println(c - d);
        return c - d;
    }

    public static double multiplication(double f, double g) {
        System.out.println(f * g);
        return f * g;
    }

    public static double division(double h, double i) {
        System.out.println(h / i);
        return h / i;
    }

    public static int modulus(int a, int b) {
        System.out.println(a % b);
        return a % b;

    }

//    BASIC ARITHMETIC ENDS


//    GET INTEGER IF ITS IN RANGE FROM MIN - MAX


    public static int getInteger(int min, int max, Scanner scan){

        System.out.println("Give me an Integer between " + min + " and  " + max);
        int input = Integer.parseInt(scan.nextLine());

        if(input < min || input > max){
            System.out.println("Outside of the limit");
            getInteger(min, max, scan);
        }else{
            System.out.println("Valid input");
            return input;
        }

        return 0;
    }

//    END OF GET INTEGER


//    GET FACTORIAL NUMBER PART 2 FUNCTION

    public static long getFactorial(long userInput) {

        long factorial = 1;

        for (int i = 1; i <= userInput; i++) {
            factorial *= i;

        }

        return factorial;

    }
//    END OF FACTORIAL PART 2 FUNCTION


//    FACTORIAL EXAMPLE FERNANDO

    public static void factor(int number) {
        int acum = 1;
        String details = "";
        for (int i = 1; i <= number; i++) {
//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24
            details += (i == 1) ? i : "x" + i;

            System.out.println(i + "! = " + details + " = " + (acum *= i));
        }

    }


    ////    ROLL DICE
    public static void rollDice(int sides, Scanner number ) {
        while (true) {
            System.out.println("would you like to start a roll, type yes");
            String userInput = number.nextLine();

            if (userInput.trim().equalsIgnoreCase("yes")) {
                System.out.println("dices" + generateRandoms(1, sides) + " " + generateRandoms(1, sides));

            } else {
                System.out.println("not a valid option exiting......................");
                break;
            }
        }
    }

    public static int generateRandoms(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));

    }

    public static void game101(Scanner scan) {
        int random = generateRandoms(1, 100);
        int number = 0;
        System.out.println("random " + random);

        while (true) {

            number = getInteger(1, 100, scan);

            if (number < random) {
                System.out.println("higher");
            } else if (number > random) {
                System.out.println("lower");
            } else if (number == random) {
                System.out.println("you guessed right");
                break;
            }
        }
    }


}


//    END OF ROLL DICE






