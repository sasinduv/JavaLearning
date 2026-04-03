import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class foreach {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Random rand = new Random();

        int a = 0;
        for(int temp:arr){
            arr[a++] =rand.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
    }
}
