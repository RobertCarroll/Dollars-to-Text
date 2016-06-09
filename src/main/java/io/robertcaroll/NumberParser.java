package io.robertcaroll;

import java.util.HashMap;

public class NumberParser {
    private static String[] smallNumbers = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static HashMap<Integer, String> largeNumberMap = new HashMap<>();

    public static void populateLargeNumberMap(){
        largeNumberMap.put(20, "Twenty");
        largeNumberMap.put(30, "Thirty");
        largeNumberMap.put(40, "Forty");
        largeNumberMap.put(50, "Fifty");
        largeNumberMap.put(60, "Sixty");
        largeNumberMap.put(70, "Seventy");
        largeNumberMap.put(80, "Eighty");
        largeNumberMap.put(90, "Ninety");
    }

    public static String wordifyNumber(int number){
        String wordifiedNumber = "";
        if(number > 99){
            wordifiedNumber += formatHundred(number);
        }else if(number % 100 > 19){
            wordifiedNumber += formatTwoDigits(number);
        }else{
            wordifiedNumber += formatSingleDigitsAndTeens(number);
        }

        return wordifiedNumber;
    }

    public static String formatSingleDigitsAndTeens(int number) {
        return smallNumbers[number];
    }

    public static String formatTwoDigits(int number) {
        String formattedNumber = "";
        if(number % 100 > 19){
            formattedNumber += largeNumberMap.get(number%100/10*10);
        }else{
            return formattedNumber + formatSingleDigitsAndTeens(number%100);
        }

        return formattedNumber + formatSingleDigitsAndTeens(number % 10);
    }

    public static String formatHundred(int number) {
        String formattedNumber = smallNumbers[number/100] + "Hundred";

        if(number % 100 > 19){
            formattedNumber += largeNumberMap.get(number%100/10*10);
        }else{
            return formattedNumber + formatSingleDigitsAndTeens(number % 100);
        }

        return formattedNumber + formatSingleDigitsAndTeens(number % 10);
    }
}
