/*
class PrintInfo{
 Integer integer;

    PrintInfo(Integer integer){
        this.integer=integer;
    }
    public void print(){
        System.out.println(integer);
    }
}


public class Demo {
    public static void main(String[] args) {
        Integer integer=new Integer(100);
        PrintInfo printInfo= new PrintInfo(integer);
        printInfo.print();
    }
}
*/

import javax.management.ObjectName;
import javax.xml.crypto.Data;
import java.util.Arrays;
/*
class Cat{}
class Dog{}

class DataSet<T>{
    Object [] bucket=new Object[10];
    int count=0;
    DataSet(T t){
        bucket[count++]=t;
    }
}

public class Demo {
    public static void main(String[] args){
      //  DataSet <Dog> c=new DataSet<>(new Cat());  has error this line cause provide object type different than define object type
        DataSet <Dog> d=new DataSet<>(new Dog()); //ok

    }
}
*/
/*
class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}

class Cat {}
class Dog extends Animal{}

class DataSet<T extends Animal>{
    Object [] bucket=new Object[10];
    int count=0;
    DataSet(T t){
        bucket[count++]=t;
    }
}

public class Demo {
    public static void main(String[] args){
        DataSet <Cat> c=new DataSet<>(new Cat()); //error data set class accept karanne super class eken inherit una ewa witarai
        DataSet <Dog> d=new DataSet<>(new Dog()); //ok

    }
}
*/

interface CricketTeam{

}
class Batsman implements CricketTeam{
    Batsman(String name){
        System.out.println("Batsman"+name);
    }
}

class Bowler implements CricketTeam{
    Bowler(String name){
        System.out.println("Bowler"+name);
    }
}

class Slc<T>{
    Object [] team= new Object[11];
    Slc(){}
    int count=0;
    public void add(T player){
        team[count++]=player;

    }
    public void announceTeam(){
        System.out.println(Arrays.toString(team));
    }
}

class Demo{
    public static void main(String[] args) {
        Batsman batsman1=new Batsman("Kusal M");
        CricketTeam batsman2=new Batsman("Pathum N");

        CricketTeam bowler1=new Bowler("Dushmantha C");
        CricketTeam bowler2=new Bowler("Wanindu H");

        Slc <CricketTeam> slc =new Slc<>();
        slc.add(batsman1);
        slc.add(batsman2);
    }
}

