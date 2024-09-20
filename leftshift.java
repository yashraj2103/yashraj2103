import java.util.Scanner;

class leftshift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to showcase of leftshift");
        System.out.println("enter your num");
        int num = input.nextInt();

        int result = num << 5;
        System.out.println("your result is: " +result);
    }
}
