package io.robertcaroll;

public class DollarFormatter {
    private static String[] units = {"", "Thousand", "Million", "Billion"};

    public static String wordifyDollars(int dollars){
        NumberParser.populateLargeNumberMap();

        if(dollars == 0){
            return "ZeroDollars";
        }

        String[] numberSets = separateNumberByCommas(dollars).split(",");
        String wordifiedDollars = "";
        int unitIndex = numberSets.length - 1;

        for(int i = 0; i < numberSets.length; i++){
            wordifiedDollars += NumberParser.wordifyNumber(Integer.valueOf(numberSets[i]));
            wordifiedDollars += units[unitIndex];
            if(unitIndex > 0) unitIndex--;
        }

        return wordifiedDollars + "Dollars";
    }

    public static String separateNumberByCommas(int number){
        return String.format("%,d", number);
    }
}
