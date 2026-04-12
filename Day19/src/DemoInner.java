/*
class Outer{
    void printOuter(){
        System.out.println(("outer"));
    }
    class Inner{
        void printInner(){
            System.out.println("Inner");
        }
    }
}

public class DemoInner {
    public static void main(String[] args) {
        Outer o= new Outer();
        o.printOuter();
      //  o.printInner(); error

        Outer.Inner i=o.new Inner();
        i.printInner();
    }
}
*/

//method local inner class
/*
class Outer{
    void Display(){
        class Inner{
            void print(){
                System.out.println("Hello world from method local inner class");
            }

        }
        Inner i = new Inner();//Inner class need call inside outer methods scope class
        i.print();
    }

}

public class DemoInner{
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.Display();
    }
}
*/

// Anonymous inner class

//interface Greeting{// marker interface --> without any method
//
//}
/*
interface Greeting{// functional interace -->  only one method
    void sayHello();
}
class DemoInner{
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };
        g.sayHello();

        Greeting H =()->System.out.println("Hello");
        g.sayHello();
    }
}
*/

interface Vehicle{
    void park(int num);
}

//public class DemoInner {
//    public static void main(String[] args) {
//        Vehicle car=(int num)-> System.out.println("car park "+num);
//        car.park(5);
//
//        Vehicle bike=(int num)-> System.out.println("bike park "+num);
//        bike.park(10);
//    }
//}

//when return somthing
interface Book{
    String reading(int num);
}

public class DemoInner {
    public static void main(String[] args) {
        Book merling=(int num)-> {
            return "merling";
        };
        merling.reading(5);

    }
}