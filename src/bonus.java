import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number and character");
        int number = scan.nextInt();
        String character = scan.next();
       for (int num = -1;num<number; num++) {
            for(int j = -1; j < num; j++){

           System.out.print(character);
            }
           System.out.println();
       }
    }
}
