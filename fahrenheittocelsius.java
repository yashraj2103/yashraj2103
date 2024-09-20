import java.util.Scanner;

class fahrenheittocelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to temperature converter");
        System.out.println("enter your temp in F:");
        float fah = input.nextFloat();
        float cel = (fah - 32) * 5 / 9;
        System.out.print("your tem is: " + cel + "C");



    }
}
