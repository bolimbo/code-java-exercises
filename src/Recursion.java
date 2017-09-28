import java.util.Scanner;

public class Recursion {
    private double numb;


    public Recursion(double number) {
        this.numb = number;

    }

    public double getNumb() {
        return this.numb;
    }

    private static double getNumber(double num) {

        Recursion re = new Recursion(7.6);


        System.out.println("enter number ");
        Scanner numb = new Scanner(System.in);
            numb.nextDouble();

        if (num == 1) {
            System.out.println(num);
            return 1;
        } else {
            System.out.println(num);
            return (num + getNumber(num - 1));

        }

    }


    public static void main(String[] args) {
Recursion recur = new Recursion(7.6);

        System.out.println(recur.getNumber(getNumber(7.6)));



    }
}
