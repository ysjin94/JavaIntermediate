package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer.valueOf("10");
        int intValue = Integer.parseInt("10");

        //Compare
        int compareResult = i1.compareTo(20);
        System.out.println(compareResult);

        System.out.println("sum :" + Integer.sum(10,20));
        System.out.println("min :" + Integer.min(10,20));
        System.out.println("max :" + Integer.max(10,20));
    }
}
