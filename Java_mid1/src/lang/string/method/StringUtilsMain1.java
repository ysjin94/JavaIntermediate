package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        String numString = String.valueOf(num);
        System.out.println("int String" + numString);
        String boolString = String.valueOf(bool);
        System.out.println("boolean String: " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("Object String: " + objString);

        String numString2 = "" + num;
        System.out.println("empty + num: " + numString2);

        char[] strCharArray = str.toCharArray();
        System.out.println("String to StringArray: " + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
