/*
interface Vehicle{
    void park();
    void start();
    void stop();
}

class Impl implements Vehicle{
    @Override
    public void park() {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
*/

interface Phone {
    void call();

   // int year;//error
    int cost=20;//public static,final
}
public class Example {
    public static void main(String[] args) {
        Phone v1 = null; //Cant create an obj using interface
        v1.call();
        System.out.println(Phone.cost);
    }
}