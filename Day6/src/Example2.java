import java.util.Random;

public class Example2 {
    public static void main(String[] args){
        for (int i=0; i<100;i++){
            Random rand = new Random();
            int x = rand.nextInt(101);
            System.out.println(x);
        }
    }
}
