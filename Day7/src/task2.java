import java.util.Scanner;

public class task2 {
    public static void printSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert number 1:");
        int num1 = input.nextInt();
        System.out.println("Insert number 2:");
        int num2 = input.nextInt();

        printSum(num1, num2);
    }
}