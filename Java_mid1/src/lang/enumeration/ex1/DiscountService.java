package lang.enumeration.ex1;

public class DiscountService {

    public int discount(String grade, int price){

        int discountPercent = 0;
        if(grade.equalsIgnoreCase(StringGrade.BASIC)){
            discountPercent = 10;
        }else if(grade.equalsIgnoreCase(StringGrade.GOLD)){
            discountPercent = 20;
        }else if(grade.equalsIgnoreCase(StringGrade.DIAMOND)){
            discountPercent = 30;
        }else {
            System.out.println(grade + " is not a valid discount grade");
        }

        return price * discountPercent / 100;
    }
}
