
//class Months{
//    final static String month1="JANUARY";
//    final static String month2="FEBRUARY";
//    final static String month3="MARCH";
//    final static String month4="APRIL";
//    final static String month5="MAY";
//}

import javax.swing.plaf.PanelUI;
import java.util.Arrays;

enum Months{
    JANUARY(1,first),FEBRURARY(2,second),MARCH(3,third),APRIL(5,four),MAY(5,five);
    final String name;
    final int number;
    Months(int number ,String name){
        this.name = name;
        this.number = number;
    }
}

//public class Demo2 {
//    public static void main(String[] args) {
//        System.out.println(check(Months.month1));
//    }
//    public static String check(String month){
//        switch (month){
//            case "JANUARY":return "JANUARY";
//            case "FEBRUARY":return "FEBRUARY";
//            case "MARCH":return "MARCH";
//            case "APRIL":return "APRIL";
//            case "MAY":return "MAY";
//            default: return "Wrong input";
//        }
//    }
//}
public class Demo2 {
    public static void main(String[] args) {
//        Months months = Months.FEBRURARY;
//        System.out.println(months);
//        System.out.println(months.number);
        System.out.println(Months.valueOf("JANUARY"));

        Months months[] = Months.values();
        System.out.println(Arrays.toString(months));

        System.out.println(Months.JANUARY.name);
        System.out.println(check(Months.FEBRURARY));
    }
    public static int check(Months month){
        switch (month){
            case JANUARY: return month.number;
            case FEBRURARY:return month.number;
            case MARCH:return month.number;
            case APRIL:return month.number;
            case MAY:return month.number;
            default:return 0;
        }
    }

}