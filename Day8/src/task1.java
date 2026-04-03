import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random rm = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = rm.nextInt(100);
        }
            System.out.println(Arrays.toString(arr));

        int max = 0;
        for (int i=0; i<10; i++){
            if (arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println("Max : " + max);
        int min = 100;
        for (int i=0; i<10; i++){
            if (arr[i]<min){
                min=arr[i];

            }
        }
        System.out.println("Min : " + min);
        int total =0;
        for (int i=0; i<10; i++){
            total += arr[i];

        }
        System.out.println("Total : " + total);

        double avg = 0;
        avg = (double)total/10;
        System.out.println("Average : "+avg);
    }
}
