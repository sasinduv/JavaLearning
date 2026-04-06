class MyClass1 {
//    MyClass1(){
    ////        System.out.println("constructor");
    ////    }

    int x;
    MyClass1() {
        System.out.println("no args constructor");
    }

    MyClass1(int x){
        this.x=x;
        System.out.println("Myclass parameter constructor"+x);
    }

    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Block");
    }
}

public class Exampl4 {
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1(10);
        System.out.println("---------------");
        MyClass1 obj2 = new MyClass1(5);
        System.out.println("---------------");

    }
}
