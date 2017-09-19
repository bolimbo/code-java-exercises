import java.util.Scanner;

public class dog {
    public static void main(String[] args) {
        Scanner dg= new Scanner(System.in);
        System.out.println("What is your dogs name");
        String name = dg.nextLine();
        Scanner dogg = new Scanner(System.in);
        System.out.println("What is your dogs breed");
        String breed = dogg.nextLine();
        Scanner doggie = new Scanner(System.in);
        System.out.println("What is your dogs color");
        String color = doggie.nextLine();

        Scanner doggy = new Scanner(System.in);
        System.out.println("What is your dogs mood");
        String mood = doggy.nextLine();

        System.out.println("My dogs name is " + name + ". " + " He is a " + breed + " and " + color + " color "+  "and he is always " + mood );
    }
}
class Park extends dog {


}