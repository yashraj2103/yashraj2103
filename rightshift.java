import java.util.Scanner;

class rightshift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to showcase of rightshift");
        System.out.println("enter your num");
        int num = input.nextInt();

        int result = num >> 2;
        System.out.println("your result is: " +result);
    }
}
