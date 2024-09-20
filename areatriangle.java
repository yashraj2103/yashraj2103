import java.util.Scanner;

class areatriangle {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to area calculator\n");
         System.out.println("please enter your base in cm: ");
         double base = input.nextDouble();
         System.out.println("enter your perpendicular in cm: ");
         double height = input.nextDouble();
         double area = 0.5 * base * height;

         System.out.println("enter your triangle is: " + area + "cm2");


     }
}
