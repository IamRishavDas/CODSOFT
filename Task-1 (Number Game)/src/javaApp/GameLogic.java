package javaApp;

import java.util.Random;

public class GameLogic {
    private static Random randomGenerator = new Random();
    private static int randomNumber;
    private static int attempts = 0;
    private static int upperBound = 100;
    private static int lowerBound = 1;
    static {
        randomNumber = randomGenerator.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
    public static void checkForWin(String enteredNumber){
        int inputNumber = -1;
        Frame frame = Frame.getFrame();
        if(enteredNumber == null || enteredNumber == ""){
            frame.setMessage("Please enter a number!");
            return;
        }
        try {
            inputNumber = Integer.parseInt(enteredNumber);
        } catch (Exception e) {
            frame.setMessage(e.getMessage());
        }
        if(inputNumber < 0 || inputNumber >100){
            frame.setMessage("Please enter a number in said range!");
            return;
        }
        if(inputNumber != randomNumber){
            attempts++;
            if(inputNumber > randomNumber){
                frame.setMessage("Entered Number is too high! Attempts: " + attempts);
            } else {
                frame.setMessage("Entered Number is too low! Attempts: " + attempts);
            }
        } else {
            attempts++;
            frame.setMessage("You Win! Correct Guess in Attempt: " + attempts);
            frame.setMessageColorToRed();
        }
    }
}
