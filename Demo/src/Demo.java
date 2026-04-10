//igi
abstract class Gun{
    abstract void fire();
}
class Ak47 extends Gun{
    void fire(){
        System.out.println("AK47:Round 580 per min");
    }
}
class Dragnow implements Gun{
    void fire(){
        System.out.println("Dragnow:Round 120 per min");
    }
}
class Solider{
    void shoot(Gun gun){
        gun.fire();
    }
}


public class Demo {
    public static void main(String[] args) {
        Solider solider = new Solider();
        Dragnow dragnow= new Dragnow();
        solider.shoot(dragnow);
    }
}
