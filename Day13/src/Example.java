class Animal{
    public void walk(){
        System.out.println("I am walking");
    }
}

class Cat extends Animal{}

class Dog extends Animal{}


class Example {
    public static void main(String[] args) {
        Cat cat= new Cat();
        cat.walk();

        new Dog().walk();
    }
}
