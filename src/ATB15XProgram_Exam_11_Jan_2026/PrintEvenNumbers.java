package ATB15XProgram_Exam_11_Jan_2026;

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range within which you want to print the even numbers:");
        int startrange = sc.nextInt();
        int endrange = sc.nextInt();
        do{
            if(startrange%2==0) {
                System.out.print(startrange++ + " ");
            }
            else{
                startrange++;
            }
        }while(startrange<=endrange);
    }
}
