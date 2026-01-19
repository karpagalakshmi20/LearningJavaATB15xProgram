package ATB15XProgram_Exam_18_Jan_2026;
import java.util.*;

public class ReverseAString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string input to be reversed:");
        String s1 = sc.nextLine();
        char[] chars = s1.toCharArray();
        int len = s1.length();
        char[] revchars = new char[len];
        for(int i=len-1, j=0; i>=0; i--){
            revchars[i] = chars[j++];
        }
        String s2 = new String(revchars);
        System.out.println("The reverse of " + s1 + " is: " + s2);
    }
}
