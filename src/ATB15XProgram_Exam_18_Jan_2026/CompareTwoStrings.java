package ATB15XProgram_Exam_18_Jan_2026;
import java.util.*;

public class CompareTwoStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an input String 1:");
        String s1 = sc.nextLine();
        System.out.println("Enter an input String 2:");
        String s2 = sc.nextLine();
        System.out.println("The result of comparison of string 1 and string 2 is:" + s1.compareTo(s2));
    }
}
