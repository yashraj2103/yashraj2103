import java.util.Scanner;

class Swap{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("welcome to swapping station\n\n");
        System.out.println("Enter value of A :");
        int a = input.nextInt();
        System.out.print("Enter value of B :");
        int b = input.nextInt();

        int c =a;
        a = b;
        b = c;
        System.out.println("value of a is :" +a);
        System.out.println("value of b is :" +b);
    }
}