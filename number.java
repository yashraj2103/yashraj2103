import java.util.Scanner;

class number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your no.:");
        int num = input.nextInt();

        if (num>0){
            System.out.println("your no. is +ve");
        }else if (num ==0){
            System.out.println("your no. is zero");
        }else {
            System.out.println("your no. is -ve");
        }
    }
}

