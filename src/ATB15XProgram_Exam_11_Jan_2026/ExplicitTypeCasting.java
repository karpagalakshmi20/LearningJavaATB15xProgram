package ATB15XProgram_Exam_11_Jan_2026;
import java.util.Scanner;

public class ExplicitTypeCasting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be type-casted:");
        double a = sc.nextDouble();
        int b = (int)a;
        System.out.println("The original value is:" + a);
        System.out.println("The value after type casting is:" + b);
    }
}
