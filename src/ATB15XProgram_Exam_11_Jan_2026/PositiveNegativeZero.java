package ATB15XProgram_Exam_11_Jan_2026;
import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int a = sc.nextInt();
        String result = ((a == 0) ? "ZERO" : (a > 0) ? "POSITIVE" : "NEGATIVE");
        System.out.println("The given input number is, " + result);
    }
}
