import java.util.Scanner;

class bitwisecompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to showcase of Not/Compliment");
        System.out.println("enter your num");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("your result is: " +result);
    }
}
