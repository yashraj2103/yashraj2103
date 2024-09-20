import java.util.Scanner;

public class floatmultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter float no.  ");
        double first = input.nextDouble();
        System.out.println("enter second no.");
        double second = input.nextDouble();


        System.out.println("\n Result is:" + first * second);

    }
}
