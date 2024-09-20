import java.util.Scanner;

class ORnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise OR oprator\n");
        System.out.println("enter the first num: ");
        int first = input.nextInt();
        System.out.println("now, enter the other num:");
        int second = input.nextInt();

        int result = first | second;
        System.out.println("result is: " + result);
    }
}