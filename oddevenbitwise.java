import java.util.Scanner;

class oddevenbitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your num: ");
        int num = input.nextInt();

        if ((num & 1)  == 1) {
            System.out.println("your num is odd");
        }else {
            System.out.println("your num is even");
        }
    }
}
