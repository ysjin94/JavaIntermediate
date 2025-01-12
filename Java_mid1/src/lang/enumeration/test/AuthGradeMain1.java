package lang.enumeration.test;

import java.util.Arrays;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades) {
            System.out.println("grade =" + grade.name() + ", level=" + grade.getLevel() + ", desc=" + grade.getDesc());
        }
    }
}
