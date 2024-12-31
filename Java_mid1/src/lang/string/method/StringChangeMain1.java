package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str1 = "Hello, Java ! Welcome to Java";

        System.out.println("Index 7 :" + str1.substring(7));
        System.out.println("Index 7 to 12 " + str1.substring(7, 12));
        System.out.println("concat " + str1.concat("!!!"));
        System.out.println("'Java' replace 'World'" + str1.replace("Java", "World"));
        System.out.println(str1.replaceFirst("Java", "World"));
    }
}
