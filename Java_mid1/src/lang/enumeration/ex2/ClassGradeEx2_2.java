package lang.enumeration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        discountService.discount(ClassGrade.BASIC, price);
    }
}
