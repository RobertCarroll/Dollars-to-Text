package io.robertcarroll;

import io.robertcaroll.Main;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainSpec {
    @Test
    public void engineTest(){
        String expected = "OneHundredThousandTwentyOneDollars";
        String actual = Main.engine(100021);
        assertEquals(expected, actual);
    }
}
