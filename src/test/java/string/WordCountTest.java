package string;

import org.junit.Assert;
import org.junit.Test;
import strings.WordCount;

public class WordCountTest {

    @Test
    public void shouldReturnNumberOfWordsInString(){

        WordCount wordCount = new WordCount();

        String str = "I am a love cats and dogs but not the flees they carry. Also i think that cats are sometimes" +
                " rude because they do not hug me when i want them too. " +
                "Overall though cats and dogs are both great.";
        String word = "cats";

        System.out.println(wordCount.countWord(str, word));

        Assert.assertTrue(wordCount.countWord(str, word) == 3);
    }


}
