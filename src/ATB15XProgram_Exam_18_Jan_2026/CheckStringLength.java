package ATB15XProgram_Exam_18_Jan_2026;
import java.util.*;

public class CheckStringLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an input String:");
        String s1 = sc.nextLine();
        char[] chars = s1.toCharArray();
        int len = chars.length;
        System.out.println((len>10) ? "Yes, length is greater than 10. " + "The length is:" + len : "No, length is not greater than 10. " + "The length is:" + len);
    }
}
