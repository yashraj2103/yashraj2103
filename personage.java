import java.util.Scanner;

class personage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        int age = input.nextInt();

        if (age >= 65) {
            System.out.println("you are senior citizen");
        } else if (age >= 20) {
            System.out.println("you are an adult");
        } else if (age >= 13) {
            System.out.println("you are a teen");
        }else {
                System.out.println("your are a child");
            }
        }
    }
