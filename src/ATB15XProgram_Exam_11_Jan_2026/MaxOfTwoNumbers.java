package ATB15XProgram_Exam_11_Jan_2026;
import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = (a>b) ? a : b;
        System.out.println("The maximum of " + a + " and " + b + " is:" + max);
    }
}
