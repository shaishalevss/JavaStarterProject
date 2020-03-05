package com.company;
import java.util.*;

public class Main {

    //Question 4 Solution
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  //setting up the scanner
        int answer = 1;
        String sNum;
        int num;

        //asks the user what he would like to do
        System.out.println("Choose what would you like to use:");
        System.out.println("1). Binary to Decimal.");
        System.out.println("2). Decimal to Binary.");

        //a do while loop that make sure the input is good and valid
        do {
            answer = in.nextInt();
            if(answer < 1 || answer > 2){
                System.out.println("Wrong Input!, Try Again!");
            }
        } while (answer < 1 || answer > 2);

        //switch case which direct the user to the right scenario according to what he selected
        switch(answer) {
            case 1:
                System.out.println("Enter the String You Would Like To Use:");
                sNum = in.next();
                System.out.println(Binary2Int(sNum));
                break;
            case 2:
                System.out.println("Enter the Number You Would Like To Use:");
                num = in.nextInt();
                Int2Binary(num);
                System.out.println(Int2Binary(num));
                break;
            default:
                System.out.println("You Must Select Something..");
        }
    }

    //Question 2 Solution
    public static int Binary2Int(String b){
        int answer = 0;
        int p = 0;
        int strLength = b.length();

        //a loop that runs from the length-1 to 0
        for(int i = strLength-1; i >= 0; i--){
            System.out.println(b.charAt(i));
            int charToInt = Character.getNumericValue(b.charAt(i)); //using getNumericValue which is included in Java Util.
            answer += charToInt * Math.pow(2,p); //increasing by 2^p
            p++; //increasing p by 1
        }
        return answer;
    }

    //Question 3 Solution
    public static String Int2Binary(int n){
        String answer;
        answer = String.format(Integer.toBinaryString(n)); //using toBinaryString to transform the integer to a binary value, and then using String.format to make the int into a String
        return answer; //return answer as a String because of our last commend(String.format)
    }

    //Question 1 Solution
    public static int maxSum(int[] arr){
        //initialize the variables
        int arrSize = arr.length;
        int maxSum = arr[0];
        int maxEnding = arr[0];

        for(int i = 1; i < arrSize; i++) {
            if(maxEnding + arr[i] < arr[i]) {
                maxEnding = arr[i]; //updates maxEnding to arr[i] value
            } else {
                maxEnding = maxEnding + arr[i]; //updates maxEnding to maxEnding+ arr[i] value(because it's more than arr[i]
            }

            if(maxEnding > maxSum) {
                maxSum = maxEnding; //updates maxSum to maxEnding value (only if maxEnding in bigger than maxSum, if not it'll skip it.
            }
        }
        return maxSum;
    }
}
