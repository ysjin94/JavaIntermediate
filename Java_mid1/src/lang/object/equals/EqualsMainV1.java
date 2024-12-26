package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
//        System.out.println("identity getID = " + (user1.getId() == user2.getId()));
        System.out.println("equality = " + user1.equals(user2));
//        System.out.println("equality getID = " + user1.getId().equals(user2.getId()));
    }
}
