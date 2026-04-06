//class Animal{
//    public void walk(){
//        System.out.println("I am walking");
//    }
//}
//
//class Cat extends Animal{}
//
//class Dog extends Animal{}
//
//
//class Example {
//    public static void main(String[] args) {
//        Cat cat= new Cat();
//        cat.walk();
//
//        new Dog().walk();
//    }
//}

//example 2
/*
class A {
    int a=1;
    public void printA(){
        System.out.println("printA :"+a);
    }
}

class B extends A{
    int b=1;
    public void printB(){

        System.out.println("printB :"+b);
    }
    public void invokeBoth(){
        printB();
        printA();
    }
    public void printBoth(){
        System.out.println("printBoth : "+b);
        System.out.println("printBoth : "+a);
    }
}

class Example {
    public static void main(String[] args) {
        B b = new B();

        b.invokeBoth();
        System.out.println("============");
        b.printBoth();
    }
}
*/
//example 3

/*
class A{
    int a=1;
    public void printA(){
        System.out.println("printA : "+a);
    }
    static{
        System.out.println("static block");
    }
}


class B extends A{
    int b=2;
    public void printB(){
        System.out.println("printB() :"+b);
    }
    static{
        System.out.println("static block B");
    }
}

class Example {
    public static void main(String[] args) {
        new B();
    }
}        */

//example 4
class A{
    static{
        System.out.println("static block A");
    }
}

class B extends A{
    static{
        System.out.println("static block B");
    }
}

class C extends B{
    static{
        System.out.println("static block C");
    }
}

class D extends B{
    static{
        System.out.println("static block D");
    }
}
class Example {
    public static void main(String[] args) {
        new B();
    }
}