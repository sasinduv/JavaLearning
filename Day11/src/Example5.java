class Std {
    int id;
    String name;
    Std (int id, String name){
        this.id= id;
        this.name= name;

    }
    Std(){

    }
    public void printStudent(){
        System.out.println("ID : "+this.id+" Name : "+this.name);
    }
    public void setStudent(int id, String name){
        this.id=id;
        this.name=name;
    }
    public void setStudent(Std s){
        this.id=s.id;
        this.name=s.name;
    }
}
public class Example5 {
    public static void main(String[] args) {
        Std s1=new Std(101,"Manuja");
        Std s2=new Std();

        s1.printStudent();
        s2.printStudent();

        s2.setStudent(s1);
        s1.printStudent();
        s2.printStudent();
    }

}
