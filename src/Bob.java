import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String another;


        do {
            Scanner bob = new Scanner(System.in);
            System.out.println("Hi Im Bob, What do you want?");

            String userQuestion = bob.nextLine();
            if (userQuestion.isEmpty()){
                System.out.println("fine be that way");

            } else if (userQuestion.endsWith("?")) {
                System.out.println("Sure!!!");

            } else if (userQuestion.endsWith("!") || userQuestion.equals(userQuestion.toUpperCase()) && !userQuestion.isEmpty()){
                System.out.println("Whoa, chill out!");

            }else
                System.out.println("Whatever");

            System.out.println("do you want to continue?");
            another = bob.next();
        }while (another.equalsIgnoreCase("yes"));

    }

}




