package task;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int mark = sc.nextInt();
        if(mark>0 & mark<60){
            System.out.println("F");
        }
        else if(mark>=60 & mark<70){
            System.out.println("D");
        }
        else if(mark>=70 & mark<80){
            System.out.println("C");
        }
        else if(mark>=80 & mark<90){
            System.out.println("B");
        }
        else if(mark>=90 & mark<=100){
            System.out.println("A");
        }
    }
}
