import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number and character");
        int number = scan.nextInt();
        String character = scan.next();
        for (int num = 1; num < number; num++) {
            for (int k = 0; k < num; k++) {

                System.out.print(character);
            }
            System.out.println(); /*this makes it loop*/
        }
    }
}
