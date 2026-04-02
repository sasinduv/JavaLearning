import java.util.Scanner;

public class Example1 {
    public static void calculate(){
        Scanner input = new Scanner(System.in);
        System.out.println("insert number 1");
        int number1=input.nextInt();
        System.out.println("insert number 2");
        int number2 = input.nextInt();
        int total= number1 + number2;
        System.out.println("Total is :" + total);

    }


    public static void main(String[] args) {
        calculate();
    }


}//Repeated same code --> just invoke the method
//Difficult to update everywhere --> change in one place
//less readable code --> cleaner
//cannot reuse the logic easily --> easy to reuse eith a method
