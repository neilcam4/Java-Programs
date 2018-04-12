
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //initiate legth of array my numbers and link to method getNumbers
        int[] myNumbers = getNumbers(5);
        // lists out numbers typed in to console
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("The number entered in was " + myNumbers[i]);
        }
        //initiate variables
        double myMean = myAnswer(0);
        int myScore=0;
        //call method to check if answer is correct
        checkAnswer(myMean, myNumbers, myScore);
        }
        //print out numbers entered
    private static int[] getNumbers(int number) {
        System.out.println("Enter in " + number + " new numbers");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    //accept given answer using scanner and send answer to myMean
    private static double myAnswer(double answer){
        System.out.println("Calculate the mean for your numbers: ");
        answer = scanner.nextDouble();
        return answer;
    }
    // calculate the mean average of numbers given
    private static double getAverage(int []array){
        int sum = 0;
        for(int i = 0;i<array.length;i++){
            sum+=array[i];
        }
        return (double)sum / (double)array.length;
        }
    //check if given answer is correct and calculate score
    private static double checkAnswer(double myMean, int[] myNumbers, int myScore){

        if(myMean==getAverage(myNumbers)){
            myScore+=5;
            System.out.println("You are correct! Your new score is " + myScore + " points");
        } else {
            System.out.println("That is false");
        }
        System.out.println("The mean is " + getAverage(myNumbers));
        return getAverage(myNumbers);
        }
    }

