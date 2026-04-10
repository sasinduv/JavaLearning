/*
class Animal extends Object{ //super --> object
    public void sound(){

    }
}
class Cat extends Animal{
    public void sound(){ //runtime polimorphism
        System.out.println("meaw meaw");
    }
}

public class Example {
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.sound();
        System.out.println(c1.getClass());
        c1.hashCode();
        c1.toString();
    }
}
*/

/*

class Customer{
    int id;
    String name;

    Customer(int id, String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return "ID :"+this.id+" Name: "+this.name;
    }
}

public class Example {
    public static void main(String[] args) {
        Customer c1 = new Customer(1,"Akila");
//        Customer c2 = new Customer(2,"Aki");
//        Customer c3 = new Customer(3,"Akil");
//
//        int hash = c1.hashCode();
//        System.out.println(Integer.toHexString(hash)); //hashcode
//        System.out.println(c1);//memory location of object reference //class+@+
//        System.out.println(c1.getClass().getName()+"@"+Integer.toHexString(hash));
//
//        Customer c4=c1;
//        System.out.println(c1==c2);
//        System.out.println(c1==c4);
//
//        System.out.println(c1.equals(c4));

        System.out.println(c1);
        System.out.println(c1.toString());
    }
}
*/

class Vehicle{
    static public void park(){
        System.out.println("Vehicle parking");
    }
}

class Car extends Vehicle{
    public static void park(){
        System.out.println("car parking");
    }
    public void horn(){
        System.out.println("car horn");
    }

}

public class Example {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.park(); //cant override static methods
    }
}