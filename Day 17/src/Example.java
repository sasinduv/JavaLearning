/*class Vehicle{
    void park(){
        System.out.println("Vehicle parking");
    }
}

class Car extends Vehicle{
    void park(){
        System.out.println("Car parking");
    }
}*/

class Animal{ }
class Dog extends Animal { }
class Cat extends Dog{}

class Zoo{
    public boolean isExists(){
        return true;
    }
    public Cat getCat(){
        return null;
    }
    public Animal getAnimal(){
        return null;
    }

    class Zoo2 extends Zoo{
        public boolean isExists(){return true;}

        public dog getCat(){
            return null;
        }
        public Dog getAnimal(){
            return null;
        }
    }
}