package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Current time: " + currentTimeMillis);

        long nanoTime = System.nanoTime();
        System.out.println("Nano time: " + nanoTime);

        Map<String, String> getenv = System.getenv();
        System.out.println("Getenv: " + getenv);

        System.out.println("properties: " + System.getProperties());
        System.out.println("System properties: " + System.getProperty("java.version"));

        // Copy Array
        char[] oriArr = {'h','e', 'l','l','o'};
        char[] copiedArr = new char[oriArr.length];
        System.arraycopy(oriArr, 0, copiedArr, 0, oriArr.length);
        System.out.println(Arrays.toString(copiedArr));

        System.exit(0);
    }
}
