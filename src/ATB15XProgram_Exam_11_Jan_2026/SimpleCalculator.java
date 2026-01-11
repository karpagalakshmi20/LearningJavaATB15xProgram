package ATB15XProgram_Exam_11_Jan_2026;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers required for calculation:");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Enter a sign to calculate the result:");
        char sign = sc.next().charAt(0);
        switch (sign){
            case '+':
                System.out.println("The sum of " + a + " and " + b + " is:" + (a+b));
                break;
            case '-':
                System.out.println("The difference of " + a + " and " + b + " is:" + (a-b));
                break;
            case '*':
                System.out.println("The product of " + a + " and " + b + " is:" + (a*b));
                break;
            case '/':
                System.out.println("The division of " + a + " and " + b + " is:" + (a/b));
                break;
            case '%':
                System.out.println("The remainder of " + a + " and " + b + " is:" + (a%b));
                break;
            default:
                System.out.println("It is an invalid symbol");
                break;
        }
    }
}
