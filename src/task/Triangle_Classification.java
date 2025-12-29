package task;
import java.util.Scanner;

public class Triangle_Classification {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        if(s1 == s2 & s2 == s3 & s3 == s1){
            System.out.println("It is a Equilateral triangle");
        }
        else if((s1 == s2 & s1 != s3) || (s2 == s3 & s2 != s1) || (s3 == s1 & s3 != s2)){
            System.out.println("It is an Isosceles triangle");
        }

        else if((s1 != s2 & s1 != s3 & s2 != s3)){
            System.out.println("It is a Scalene triangle");
        }
    }
}
