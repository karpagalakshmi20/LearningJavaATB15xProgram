package ATB15XProgram_Exam_11_Jan_2026;
import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
        int num = sc.nextInt();
        int a = 0;
        do{
            a = a*10 + num%10;
            num/=10;
        }while(num>0);
        System.out.println("The reverse of the number is:" + a);
    }
}
