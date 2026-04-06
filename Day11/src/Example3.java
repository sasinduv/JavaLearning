public class Example3 {
    int x=100;
    static int y =200;

    //how behave methods it's also like variables
    public void instanceMethod() {
        System.out.println("InstanceMethod");
    }
    public static void staticMethod() {
        System.out.println("StaticMethod");
    }
    public static void main(String[] args) {
        System.out.println(y);
        System.out.println(Example3.y);
        // System.out.println(x); cabt use instance inside the static context,but we can access through instance

        Example3 e = new Example3();
        System.out.println(e.x);
        System.out.println(e.y);

        staticMethod();
        Example3.staticMethod();//ok
        // instanceMethod(); error
        //Example.instanceMethod(); error

        Example3 emethod=new Example3();
        emethod.staticMethod();
        emethod.instanceMethod();

    }
}
