package ATB15XProgram_Exam_11_Jan_2026;

public class BreakStatementExample {
    public static void main(String[] args){
        int i=1;
        while(i<=10){
            if(i==5){
                break;
            }
            else{
                System.out.print(i++ + " ");
            }
        }
    }
}
