import java.util.Scanner;

class multiplicationtable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz enter your num: ");
        int num = scanner.nextInt();
        printmultiplicationtable(num);
    }

    public static void printmultiplicationtable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + "X" + i + "=" + (num * i));
            i++;
        }
    }
}


