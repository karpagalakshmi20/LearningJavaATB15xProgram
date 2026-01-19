package ATB15XProgram_Exam_18_Jan_2026;
import java.util.*;

public class ConvertStringToUppercase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string input to convert it to uppercase:");
        String s1 = sc.nextLine();
        System.out.println("The string post converting into uppercase is:" + s1.toUpperCase());
    }
}
