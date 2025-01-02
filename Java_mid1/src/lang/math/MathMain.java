package lang.math;

public class MathMain {
    public static void main(String[] args) {

        System.out.println("max(10, 20): " + Math.max(10, 20));
        System.out.println("min(10, 20): " + Math.min(10, 20));
        System.out.println("abs(-10): " + Math.abs(-10));

        System.out.println("ceil(2.1): " + Math.ceil(2.1)); //round up
        System.out.println("floor(2.7): " + Math.floor(2.7)); //round down
        System.out.println("round(2.5): " + Math.round(2.5)); //round

        System.out.println("sqrt(4): " + Math.sqrt(4));
        System.out.println("random(): " + Math.random());
    }
}
