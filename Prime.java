import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("entr your num");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println("your num is prime");
        }else {
            System.out.println("your num is not prime");
        }
    }

    public static boolean isPrime(int num){
        int i = 2;
        while (i < num){
            if (num % i == 0 ){
                return false;
            }
            i++;
        }

        return true;
    }
}
