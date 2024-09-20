import java.util.Scanner;

class simpleinterest {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to simple interest calculator\n");
         System.out.println("enter your principle amount Rs");
         int principle = input.nextInt();
         System.out.println("now,tell me your rate of interest:");
         float rate = input.nextFloat();
         System.out.println("now tell me for how many yeas are you borrow:");
         float years = input.nextFloat();

         float interest = (principle * rate * years) / 100;
         System.out.println("\n\n your simple interest is Rs" +interest);
     }
}
