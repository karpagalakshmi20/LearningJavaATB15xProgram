package ATB15XProgram_Exam_11_Jan_2026;
import java.util.Scanner;

public class DayInAWeek {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7, to print the corresponding day:");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("It is Sunday");
                break;
            case 2:
                System.out.println("It is Monday");
                break;
            case 3:
                System.out.println("It is Tuesday");
                break;
            case 4:
                System.out.println("It is Wednesday");
                break;
            case 5:
                System.out.println("It is Thursday");
                break;
            case 6:
                System.out.println("It is Friday");
                break;
            case 7:
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("It is an invalid number");
                break;
        }
    }
}
