package lang.string.method;

public class StringInfoMain {

    public static void main(String[] args) {

        String str = "Hello, Java!";
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank()); //Java 11
        System.out.println(" ".isBlank());
        char c = str.charAt(7);
        System.out.println(c);
    }

}
