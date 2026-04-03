public class Example {
    public static int print(int value) {
        int x= value;
        x++;
        System.out.println(x);
        return x;
    }

    public static void main(String[] args) {
        int x = 50;
        x = print(x);
        System.out.println(x);
    }
}
