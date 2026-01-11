package ATB15XProgram_Exam_11_Jan_2026;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked for even or odd:");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println(a + " is an even number");
        }
        else{
            System.out.println(a + " is an odd number");
        }
    }
}
