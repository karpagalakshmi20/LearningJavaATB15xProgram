package ATB15XProgram_Exam_18_Jan_2026;
import java.util.*;

public class CountCharactersInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new input String:");
        String s1 = sc.nextLine();
        char[] chars = s1.toCharArray();
        int len = 0;
        for(int i=0; i<chars.length; i++){
            if(chars[i] != ' '){
                len++;
            }
        }
        System.out.println("The length of the String " + s1 + " is: " + len);
    }
}
