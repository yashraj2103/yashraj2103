import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to arith. calculator\n");
        System.out.println("enter first no.");
        int first = input.nextInt();
        System.out.println("enter second no.");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("Addition is: " + add);
        System.out.println("Subtraction is: " + sub);
        System.out.println("Multiplication  is: " + mul);
        System.out.println("Division is: " + div);
        System.out.println("Modulus is: " + mod);
    }
}
