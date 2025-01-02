package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        //Primitive -> wrapper
        int value = 7;
        Integer boxedValue = value; // Auto-Boxing

        //Wrapper -> Primitive
        int unboxedValue = boxedValue; //Auto-Unboxing

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
