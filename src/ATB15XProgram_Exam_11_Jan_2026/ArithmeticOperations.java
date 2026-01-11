package ATB15XProgram_Exam_11_Jan_2026;

import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers required for operation:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The arithmetic operations on the numbers " + a + ", " + b + " are as follows:");
        System.out.println("The sum of " + a + " and " + b + " is:" + (a+b));
        System.out.println("The difference of " + a + " and " + b + " is:" + (a-b));
        System.out.println("The product of " + a + " and " + b  + " is:" + (a*b));
        System.out.println("The division of " + a + " and " + b + " is:" + (a/b));
        System.out.println("The remainder of " + a + " and " + b + " is:" + (a%b));
    }
}
