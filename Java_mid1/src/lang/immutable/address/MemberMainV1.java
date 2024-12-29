package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("Seoul");
        MemberV1 memberA = new MemberV1("MemberA", address);
        MemberV1 memberB = new MemberV1("MemberB", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        memberB.getAddress().setValue("Busan");
        System.out.println("Busan -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

    }
}
