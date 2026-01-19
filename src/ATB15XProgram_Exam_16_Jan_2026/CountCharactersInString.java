package ATB15XProgram_Exam_16_Jan_2026;
import java.util.*;

public class CountCharactersInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new input String:");
        String s1 = sc.nextLine();
        char[] chars = s1.toCharArray();
        int len = chars.length;
        System.out.println("The length of the String " + s1 + " is: " + len);
    }
}
