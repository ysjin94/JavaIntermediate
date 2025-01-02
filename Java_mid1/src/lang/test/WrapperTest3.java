package lang.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        Integer integer = Integer.valueOf(str);
        System.out.println(integer);

        int integer2 = integer.intValue();
        System.out.println(integer2);
    }
}
