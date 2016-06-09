package io.robertcaroll;

import java.util.Scanner;

public class UserInputHandler {
    private static Scanner inputHandler = new Scanner(System.in);

    public static void promptUser(String message){
        System.out.println(message);
    }

    public static int getDollarInput(){
        int inputValue = 0;

        while(true){
            promptUser("Enter a dollar amount:");
            String input = inputHandler.next();

            try{
                inputValue = Integer.parseInt(input);
                break;
            }catch (NumberFormatException e){
                System.out.println("That input was not a number.");
            }
        }

        return inputValue;
    }
}
