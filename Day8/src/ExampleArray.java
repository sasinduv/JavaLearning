import java.util.Arrays;
import java.util.Scanner;

public class ExampleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];

        for (int i = 0;i<5 ; i++){
            System.out.println("Enter number "+(i+1));
            arr[i] = sc.nextInt();
        }

        int total = 0;for (int j=0;j<5;j++){
            total += arr[j];
        }
        System.out.println("Total :" +total);
//        System.out.println("Enter the number");
//        arr[0] = sc.nextInt();
//
//        System.out.println("Enter the number");
//        arr[1] = sc.nextInt();
//        System.out.println("Enter the number");
//        arr[2] = sc.nextInt();
//
//        System.out.println("Enter the number");
//        arr[3] = sc.nextInt();
//
//        System.out.println("Enter the number");
//        arr[4] = sc.nextInt();

        System.out.println(Arrays.toString(arr));

    }


}
