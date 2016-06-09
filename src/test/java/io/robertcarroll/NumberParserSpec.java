package io.robertcarroll;

import io.robertcaroll.NumberParser;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberParserSpec {
    @Before
    public void setUp(){
        NumberParser.populateLargeNumberMap();
    }

    @Test
    public void wordifyNumberTest_Hundred(){
        String expected = "TwoHundredTwentyOne";
        String actual = NumberParser.wordifyNumber(221);
        assertEquals(expected, actual);
    }

    @Test
    public void wordifyNumberTest_TwoDigit(){
        String expected = "TwentyOne";
        String actual = NumberParser.wordifyNumber(21);
        assertEquals(expected, actual);
    }

    @Test
    public void wordifyNumberTest_SingleDigit(){
        String expected = "Two";
        String actual = NumberParser.wordifyNumber(2);
        assertEquals(expected, actual);
    }

    @Test
    public void formatHundredTest(){
        String expected = "TwoHundredTwentyTwo";
        String actual = NumberParser.formatHundred(222);
        assertEquals(expected, actual);
    }

    @Test
    public void formatTwoDigitsTest(){
        String expected = "TwentyTwo";
        String actual = NumberParser.formatTwoDigits(22);
        assertEquals(expected, actual);
    }

    @Test
    public void formatTwoDigitsTest_Teens(){
        String expected = "Eighteen";
        String actual = NumberParser.formatTwoDigits(18);
        assertEquals(expected, actual);
    }

    @Test
    public void formatSingleDigitAndTeensTest(){
        String expected = "Two";
        String actual = NumberParser.formatSingleDigitsAndTeens(2);
        assertEquals(expected, actual);
    }
}
