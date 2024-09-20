import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your num");
        int first = input.nextInt();
        System.out.println("entr your num");
        int second = input.nextInt();
        int lcm = lcm(first, second);
        System.out.println("lcm of the two num is: " + lcm);
    }

    public static int lcm(int first, int second) {
        int i = 1;
        while (true) {
            int factor = first * i;
            if (factor % second == 0){
                return factor;
            }
            i++;
        }

    }
}
