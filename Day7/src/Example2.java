public class Example2 {
    public static int printTotal(int... numbers){     //(int... ) <-- var args
//    int total= val1+val2;
//    return total;
        return 0;
    }

    public static void main(String[] args){
        int result = printTotal(10,20,30,40);
        System.out.println(result);
    }
}
