import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        int numOfScores = 0;
        int totalSum = 0;
        Scanner input = new Scanner(System.in);
        int recentNum = 0;
        do{
            System.out.println("Enter student's grade: ");
            recentNum = input.nextInt();
            if(recentNum<=100 && recentNum>0){
                totalSum+= recentNum;
                numOfScores++;
            }
            else{
                if(recentNum>0)
                System.out.println("Make sure the number is less than or equal to 100");

                continue;
            }
        }while(recentNum>0);
        int average = totalSum/numOfScores;
        String message = "";

        if(average>90){
            message = "Excellent Work!";
        }
        else if(average>80){
            message = "Good Job!";
        }
        else if(average>70){
            message = "Keep it up!";
        }
        else{
            message = "Let's work hard to get those grades up!";

        }
        System.out.println("The average of all the scores is : " + average + ". " + message);

    }

}
