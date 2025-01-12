package lang.enumeration.ex0;

public class DiscountService {

    public int discount(String grade, int price){

        int discountPercent = 0;
        if(grade.equalsIgnoreCase("basic")){
            discountPercent = 10;
        }else if(grade.equalsIgnoreCase("gold")){
            discountPercent = 20;
        }else if(grade.equalsIgnoreCase("diamond")){
            discountPercent = 30;
        }else {
            System.out.println(grade + " is not a valid discount grade");
        }

        return price * discountPercent / 100;
    }
}
