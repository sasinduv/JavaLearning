//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 100,y=200,z;
        z=x+y;
        System.out.println(z);
        z=y-x;
        System.out.println(z);
        z=x*y;
        System.out.println(z);
    //Division
//integer division
        int a = 11;
        int b = 5;
        int c = a/b;
        int remainder = a%b;
        System.out.println(c);
        System.out.println(remainder);

        //foalting point division

        double e = 125;
        double f = 10;
        double g = e/f;
        System.out.println(g);
//unary operation
        int h =- x;
        System.out.println(h);

//        increment and decrement
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        char i = 'A';
        i++;
        System.out.println(i);
        System.out.println((int)i);
    }
}