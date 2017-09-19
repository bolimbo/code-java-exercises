import java.util.Scanner;

public class consoleExercises {
    public  static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int Number = scan.nextInt();


        System.out.println("enter 3 words: ");
        String one = scan.next();
        String two = scan.next();
        String three = scan.next();

//        scan.nextLine(); for prompt sentence question to work and get processed
//          OR  this:
   Scanner scn = new Scanner(System.in);

        System.out.println("Enter a sentence:");
      String sentence = scn.nextLine();


        System.out.println("What is the width?");
        double wt = Double.parseDouble(scn.nextLine());

        System.out.println("what is the length?");
        double lt = Double.parseDouble(scn.nextLine());
        double area = wt * lt;

        System.out.println("the area is:" + area);
        double perimter = (2 * wt) + (2 * lt);
        System.out.println("the perimeter is " + perimter);

        System.out.println("what is the height");
        int ht = Integer.parseInt(scn.nextLine());
        double volumen = perimter * ht;
        System.out.println("the volume is " + volumen);

    }
    }


