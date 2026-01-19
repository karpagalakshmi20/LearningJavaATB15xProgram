package task;
import java.util.*;

public class Task_Jan16_SecondHighestValueInArray {

    public static void findsecondmax(int[] arr){
        Arrays.sort(arr);
        int[] newarr = new int[arr.length];
        for(int i=arr.length-1,j=0; i>=0; i--){
            newarr[i] = arr[j++];
        }
        System.out.println("The second highest element in the array is:" + newarr[1]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the input array:");
        int len = sc.nextInt();
        int[] arr = new int[len];

        System.out.println("Enter the values of array elements:");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

        findsecondmax(arr);
    }
}
