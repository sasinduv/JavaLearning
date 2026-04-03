import java.util.Arrays;
import java.util.Random;

public class Array2D {

    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        Random random = new Random();
        for (int i=0;i<arr.length;i++) {

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

}
