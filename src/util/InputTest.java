package util;


//solutions from opp with z
//methods from input go here

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter a nmber between 1 and 10");
        int number = input.getInt(1,10);

        System.out.println("you entered " + number);
    }
}
