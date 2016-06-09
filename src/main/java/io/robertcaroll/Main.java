package io.robertcaroll;

public class Main {
    public static String engine(int input){
        return DollarFormatter.wordifyDollars(input);
    }

    public static void main(String[] args) {
        int input = UserInputHandler.getDollarInput();
        System.out.println( engine(input) );
    }
}
