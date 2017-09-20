import java.util.Scanner;

public class animal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What kind of pet do you have?");
        String pet = scan.nextLine();

        System.out.println("What is your pets name");
        String petName = scan.nextLine();

        System.out.println("What is your pets breed");
        String petBreed = scan.nextLine();

        System.out.println("What is your pets color");
        String petColor = scan.nextLine();


        System.out.println("What is your pets mood");
        String petMood = scan.nextLine();

        System.out.println("I have a/an " + pet + ". " + "His/Her name is " + petName + ". " + "He/She is a " + petBreed + " and " + petColor + " color " + "and he/she is always " + petMood);
    }

    public void bark() {
        System.out.println("woof woof");
    }
}



//class Park extends animal {
//    Park park = new Park();
//    System.out.println( park.bark();
//
//}
