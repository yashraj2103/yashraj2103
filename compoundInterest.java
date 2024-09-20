import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;


class compoundInterest {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to compound interest calculator");
         System.out.println("please enter your principle amount Rs");
         int principle = input.nextInt();
         System.out.println("now tell me your rate of interest:");
         float rate = input.nextFloat();
         System.out.println("now tell me for how many years are borrow");
         float years = input.nextFloat();

         double compoundInterest = principle * Math.pow((1 + rate / 100), years);
         System.out.println("your compound interest is Rs:" + compoundInterest);
     }
}
