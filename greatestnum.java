import java.util.Scanner;

public class greatestnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your num");
        int first = input.nextInt();
        System.out.println("now, enter your sec num");
        int  second =input.nextInt();
        System.out.println("enter your third num");
    int third = input.nextInt();

    if (first >= second && first >= third){
        System.out.println(first + " is the greatest num");
    }else if(second >= third) {
        System.out.println(second + " is the greatest num");
    }else {
        System.out.print(third + " is the greatest num");
    }

    }

}
