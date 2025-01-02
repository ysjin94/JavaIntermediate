package lang.test;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    Random random = new Random();
    private int[] selectNumbers = new int[6];
    int count = 0;

    public void selectNumber(){
        int randomRange1 = random.nextInt(45) + 1;
//        System.out.println("randomRange1->" + randomRange1);
//        System.out.println("isUnique(randomRange1)" + !isUnique(randomRange1));
        while(isUnique(randomRange1)){
            selectNumbers[count] = randomRange1;
            count++;
        }

    }

    public void getNumbers(){
        while(count < 6) {
            selectNumber();
        }
        Arrays.sort(selectNumbers);
        System.out.println(Arrays.toString(selectNumbers));
    }

    public boolean isUnique(int number) {
        for (int i = 0; i < selectNumbers.length; i++) {
            if (number == selectNumbers[i]) {
                return false;
            }
        }
        return true;
    }
}
