package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // ToString() from Object
        String childString = child.toString();
        System.out.println(childString);
    }
}
