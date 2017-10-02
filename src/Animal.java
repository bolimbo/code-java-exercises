import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        Animal theAnimal = new Animal();


        System.out.println("What kind of pet do you have?!");
        String pet = scan.nextLine();
        System.out.println("a " + pet + " how cute =)");

        System.out.println("Is you " + pet + " Male or Female?");
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
            System.out.println("I have a " + " " + petGender + " " + pet + ". " + "His name is " + petName + ". " + "He is a " + petBreed + " breed " + ". " + "His fur is " + petColor + " color " + "and he is always " + petMood);

        } else if (petGender.equalsIgnoreCase("female")) {
            System.out.println(petName + " " + "its a girl");
            System.out.println("I have a " + " " + petGender + " " + pet + ". " + "Her name is " + petName + ". " + "She is a " + petBreed + " breed" + ". " + "Her fur is " + petColor + " color " + "and she is always " + petMood + " .");

        }
        if (pet.equalsIgnoreCase("turtle")|| pet.equalsIgnoreCase("fish")); {
            System.out.println("what type of species ?");
           scan.nextLine();
        }
        }

    public Animal() {

    }
    public static void speakAnimal(Animal pup) {
        System.out.println("jj");
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
