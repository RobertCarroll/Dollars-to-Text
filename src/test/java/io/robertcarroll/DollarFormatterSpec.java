package io.robertcarroll;

import io.robertcaroll.DollarFormatter;
import static org.junit.Assert.*;
import org.junit.Test;

public class DollarFormatterSpec {
    @Test
    public void separateNumberByCommasTest_Hundred(){
        String expected = "523";
        String actual = DollarFormatter.separateNumberByCommas(523);
        assertEquals(expected, actual);
    }

    @Test
    public void separateNumberByCommasTest_Thousand(){
        String expected = "34,523";
        String actual = DollarFormatter.separateNumberByCommas(34523);
        assertEquals(expected, actual);
    }

    @Test
    public void separateNumberByCommasTest_Million(){
        String expected = "1,234,523";
        String actual = DollarFormatter.separateNumberByCommas(1234523);
        assertEquals(expected, actual);
    }

    @Test
    public void separateNumberByCommasTest_Billion(){
        String expected = "1,000,000,000";
        String actual = DollarFormatter.separateNumberByCommas(1000000000);
        assertEquals(expected, actual);
    }

    @Test
    public void wordifyDollarsTest_Zero(){
        String expected = "ZeroDollars";
        String actual = DollarFormatter.wordifyDollars(0);
        assertEquals(expected, actual);
    }

    @Test
    public void wordifyDollarsTest_SingleDigit(){
        String expected = "SixDollars";
        String actual = DollarFormatter.wordifyDollars(6);
        assertEquals(expected, actual);
    }

    @Test
    public void wordifyDollarsTest_Tens(){
        String expected = "SixteenDollars";
        String actual = DollarFormatter.wordifyDollars(16);
        assertEquals(expected, actual);
    }

    @Test
    public void wordifyDollarsTest_Thousands(){
        String expected = "TwoThousandTwoHundredDollars";
        String actual = DollarFormatter.wordifyDollars(2200);
        assertEquals(expected, actual);
    }

    @Test
    public void wordifyDollarsTest_Millions(){
        String expected = "TwentyMillionTwoHundredTwentyFiveThousandTwentyFiveDollars";
        String actual = DollarFormatter.wordifyDollars(20225025);
        assertEquals(expected, actual);
    }

    @Test
    public void wordifyDollarsTest_Billions(){
        String expected = "OneBillionTwentyMillionTwoHundredTwentyFiveThousandTwentyFiveDollars";
        String actual = DollarFormatter.wordifyDollars(1020225025);
        assertEquals(expected, actual);
    }
}
