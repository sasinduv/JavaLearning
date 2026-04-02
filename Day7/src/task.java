public class task {
    public static void printSum(){
        int sum = 0;
        for (int i = 0; i <= 10; i++){
            sum += i;
        }
        System.out.println("Sum of First ten natural numbers :" + sum );
    }

    public static void main(String[] args) {
        printSum();
    }
}
