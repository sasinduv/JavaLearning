/*
class MyClass{

    long []arr=new long[120000];
}
public class Demo {
    public static void main(String[] args) {
        System.out.println("Start main");
        MyClass myClassArr[]=new MyClass[120000];
        for (int i = 0; i<120000; i++){
            System.out.println(i);
            myClassArr[i]=new MyClass();
        }
        System.out.println("end main");
    }
}
*/

/*
class MyClass{
    long []arr=new long[120000];
    protected void finalize(){
        System.out.println("mama awa kala giya");
    }
}

public class Demo {
    public static void main(String[] args) {
        System.out.println("start main");
        MyClass myClassArr[]=new MyClass[120000];
        for (int i=0;i<120000;i++){
            System.out.println(i);
            myClassArr[i]=new MyClass();
        }
        System.out.println("end main");
    }
}
*/

class MyClass{
    long []arr=new long[120000];
    protected void finalize(){
        System.out.println("mama awa kala giya");
    }
}

public class Demo {
    public static void main(String[] args) {
        System.out.println("start main");
        MyClass mc = new MyClass();

        new MyClass();
        new MyClass();
        //System.gc();//garbage collector
        Runtime.getRuntime().gc();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("end main");
    }
}
