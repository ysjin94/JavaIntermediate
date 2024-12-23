package lang.object.toString;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("model Y");
        Dog dog1 = new Dog("dog1", 2);
        Dog dog2 = new Dog("dog2", 5);

        System.out.println("1. Call toString().");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println();
        System.out.println("2. println Call toString().");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println();
        System.out.println("3. Object Poly Call toString().");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        //How to get reference value
        String refVal = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println(refVal);
    }
}
