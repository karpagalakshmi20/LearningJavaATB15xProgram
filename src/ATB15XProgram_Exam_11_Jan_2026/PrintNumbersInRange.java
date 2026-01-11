package ATB15XProgram_Exam_11_Jan_2026;
import java.util.Scanner;

public class PrintNumbersInRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range within which you want to print the numbers:");
        int startrange = sc.nextInt();
        int endrange = sc.nextInt();
        do{
            System.out.print(startrange++ + " ");
        }while(startrange<=endrange);
    }
}
