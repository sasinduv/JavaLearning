public class Example {
    public static void main(String[] args){
        int marks = 9;
//        String grade= '';

//        String grade = (marks>50) ? "pass":"fail";
//                System.out.println(grade);

        String grd = marks>50?marks>=80?"perfect":"pass":"fail";
        System.out.println(grd);
    }
}
