import java.sql.SQLOutput;
import java.util.Scanner;

 class parameter {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("welcome to parameter calculator");
        System.out.println("enter all 4 sides in cm");
        double a = input.nextDouble();
        double b  = input.nextDouble();
        double c = input.nextDouble();
        double d  = input.nextDouble();
        double parameter = a+b+c+d;

        System.out.print("parameter of your rectangle is:" +parameter+ "cm");
    }
}
