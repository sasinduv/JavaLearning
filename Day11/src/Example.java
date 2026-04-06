class Student{
    String name;
    int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if (age<0){
            System.out.println("Invalid age");
            return;
        }else{
            this.age=age;
        }
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
    return this.age;
}}

public class Example {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sasindu");
        student.setAge(24);
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}