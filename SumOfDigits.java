import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("entr your num");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("sum of digits is: " + sum);

    }
    public static int sumOfDigits(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
