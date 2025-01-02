package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer integer = Integer.valueOf(10);
        Long longObj = Long.valueOf(10);
        Double doubleObj = Double.valueOf(10);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integer = " + integer);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("READ internal value");
        System.out.println(newInteger.intValue());
        System.out.println(longObj.longValue());
        System.out.println(doubleObj.doubleValue());

        System.out.println("Compare");
//        Integer newInteger = Integer.valueOf(10);
//        Integer integer = Integer.valueOf(10);
//        System.out.println("== :" + (newInteger == integer)); // return true, bc cache
        System.out.println("== :" + (newInteger == integer));
        System.out.println("equals :" + (newInteger.equals(integer)));
    }
}
