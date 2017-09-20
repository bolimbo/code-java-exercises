import java.util.Scanner;

public class animal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What kind of pet do you have?!");
        String pet = scan.nextLine();
        System.out.println("a " + pet + " how cute =)");

        System.out.println("Is you " + pet  + " Male or Female?1" );
        String petGender = scan.nextLine();




        System.out.println("What is your " + pet + "'s" + " name?");
        String petName = scan.nextLine();


        System.out.println("What is " + petName + "'s" + " breed?");
        String petBreed = scan.nextLine();

        System.out.println("What is " + petName + "'s" + " color");
        String petColor = scan.nextLine();
        System.out.println(petColor + "!!!" + " What a beautiful color!.");


        System.out.println("What is " + petName + "'s" + " mood");
        String petMood = scan.nextLine();


        if (petGender.equalsIgnoreCase("male")) {
            System.out.println(petName + " " + "its a boy");
            System.out.println("I have a " + " " + petGender + " " + pet + ". " + "His name is " + petName + ". " + "He is a " + petBreed + " breed " + ". " +"His fur color is " + petColor + " color " + "and he is always " + petMood);

        } else if(petGender.equalsIgnoreCase("female")) {
            System.out.println(petName + " " + "its a girl");
            System.out.println("I have a " + " " + petGender + " " + pet + ". " + "Her name is " + petName + ". " + "She is a " + petBreed + " breed " + ". " + "Her fur color is "+ petColor + " color " + "and she is always " + petMood + " .");

        }


//        System.out.println("I have a/an " + pet + ". " + "His/Her name is " + petName + ". " + "He/She is a " + petBreed + " and " + petColor + " color " + "and he/she is always " + petMood);


    }
}





//    public void bark() {
//        System.out.println("woof woof");
//    }

//class Park extends animal {
//    Park park = new Park();
//    System.out.println( park.bark();
//
//}
