package string;

import org.junit.Assert;
import org.junit.Test;
import strings.CharCount;

public class CharCountTest {

    @Test
    public void shouldReturnTrueIfCountChars(){
        CharCount charCount = new CharCount();
        String testString = "a.b.c.d";
        char word = '.';

        System.out.println(charCount.countChars(testString, word));

        Assert.assertTrue(charCount.countChars(testString, word) == 3);
    }
}
