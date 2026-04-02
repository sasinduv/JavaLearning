public class Example {
    public static void main(String[] args){
        int x = 7;
        int y = 2;

        double d = (double) x/y; //narrow convertion
        System.out.println(d);

        short sh = 100; //16bit
       // byte b = (byte) sh;
       // System.out.println(b);

        byte b=42;
        char c=(char)b;
        System.out.println(c);

        System.out.println((int)'*');
    }

}
