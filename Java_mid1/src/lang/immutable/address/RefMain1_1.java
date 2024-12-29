package lang.immutable.address;

public class RefMain1_1 {

    public static void main(String[] args) {
        //Reference Type CAN SHARE INSTANCE

        Address a = new Address("Seoul");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("Busan");
        System.out.println("Busan -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
