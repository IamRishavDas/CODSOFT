package javaApp;

import java.util.Random;

public class GameLogic {
    private static Random randomGenerator = new Random();
    private static int randomNumber;
    private static int attempts = 0;
    private static int upperBound = 100;
    private static int lowerBound = 1;

    static{
        randomNumber = randomGenerator.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
    
    public static void generateNewRandom(){
        randomNumber = randomGenerator.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    public static void resetAttemptCount(){
        attempts = 0;
    }

    public static void checkForWin(String enteredNumber){
        int inputNumber = -1;
        Frame frame = Frame.getFrame();
        if(enteredNumber == null || enteredNumber == ""){
            frame.setMessage("Please enter a number!");
            frame.setMessageColorToRed();
            return;
        }
        try {
            inputNumber = Integer.parseInt(enteredNumber);
        } catch (Exception e) {
            frame.setMessage(e.getMessage());
        }
        if(inputNumber < 0 || inputNumber >100){
            frame.setMessage("Please enter a number in said range!");
            frame.setMessageColorToRed();
            return;
        }
        if(inputNumber != randomNumber){
            attempts++;
            if(inputNumber > randomNumber){
                frame.setMessage("Entered Number is "+ isFarAway(inputNumber) + isClose(inputNumber) +" high! Attempts: " + attempts);
                frame.setMessageColorToRed();
            } else {
                frame.setMessage("Entered Number is "+ isFarAway(inputNumber) + isClose(inputNumber) +" low! Attempts: " + attempts);
                frame.setMessageColorToRed();
            }
        } else {
            attempts++;
            frame.setMessage("You Win! Correct Guess in Attempt: " + attempts);
            frame.setMessageColorToGreen();
            frame.setMessageNonEditable();
        }
    }

    private static String isFarAway(int inputNumber){
        if(Math.abs(randomNumber - inputNumber) >= 10) return "too";
        else return "";
    }
    private static String isClose(int inputNumber){
        if(Math.abs(randomNumber - inputNumber) < 10) return "close and";
        else return "";
    }
}
