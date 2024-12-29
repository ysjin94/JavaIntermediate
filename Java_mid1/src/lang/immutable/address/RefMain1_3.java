package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        //Reference Type CAN SHARE INSTANCE

        Address a = new Address("Seoul");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "Busan");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("Address has been changed -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
