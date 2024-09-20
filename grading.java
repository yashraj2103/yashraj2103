import java.util.Scanner;

public class grading {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your percentage");
        float percentage = input.nextFloat();

        if (percentage >= 90) {
            System.out.println("you  got A");
        } else if (percentage >= 75) {
            System.out.println("you got B");
        } else if (percentage >= 60) {
            System.out.println("you got C");
        } else if (percentage >= 30) {
            System.out.println("you got D ");
        } else {
            System.out.println("you have failed in exam😢");
        }
    }
}