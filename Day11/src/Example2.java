class MyClass{
    int x; //instant attribute
    static int y; //static variable/class variable/template variable

}


public class Example2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.x = 1;
        obj.y = 2;

        MyClass obj2 = new MyClass();
        obj2.x=10;
        obj2.y=20;

        System.out.println("x with obj : "+obj.x+" and y with obj : "+obj.y);//obj
        System.out.println("x with obj2 : "+obj2.x+" and y with obj2 : "+obj2.y);
    }
}
