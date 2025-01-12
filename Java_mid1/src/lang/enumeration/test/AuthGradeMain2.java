package lang.enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your Level [GUEST, LOGIN, ADMIN]: ");
        String grade = scanner.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("Your Level : " + authGrade.getDesc());
        System.out.println("Manu List");
        if (authGrade.getLevel() > 0) {
            System.out.println("- Main");
        }
        if (authGrade.getLevel() > 1) {
            System.out.println("- User Email");
        }
        if (authGrade.getLevel() > 2) {
            System.out.println("- Admin");
        }
    }
}
