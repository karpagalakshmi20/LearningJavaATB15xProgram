package task;
import java.util.*;

public class Task_Jan16_ReverseAString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new input String:");
        String s1 = sc.nextLine();
        char[] chars1 = s1.toCharArray();
        char[] chars2 = new char[chars1.length];
        int len = s1.length();
        for(int i=len-1,j=0; i>=0; i--){
            chars2[i] = chars1[j++];
        }
        String s2 = new String(chars2);
        System.out.println("The reversed string is:");
        System.out.println(s2);
    }
}
/*
s1 = "Apple" -> "elppA"
 */
