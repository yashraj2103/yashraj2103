import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your no.");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("your no. is an even no.");
        }else{
            System.out.println("your no. is an odd no.");
        }
    }
}
