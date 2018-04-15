package string;

import org.junit.Assert;
import org.junit.Test;
import strings.ShortMessage;

import java.util.ArrayList;
import java.util.List;

public class ShortMessageTest {

    @Test
    public void shouldReturnTrueIfMakeShortMessage(){

        ShortMessage shortMessage = new ShortMessage();

        String str = "I am a love cats and " +
                "dogs but not the flees they carry. Also i think that cats are sometimes" +
                " rude because they do not hug me when i want them too. " +
                "Overall though cats and dogs are both great.";

        System.out.println(shortMessage.solution(str).size());
        List<String> msg = shortMessage.solution(str);

        for (String s : msg) {
            System.out.println(s);
        }

        //Assert.assertTrue(shortMessage.solution(str).size() == 5);
    }

    @Test
    public void shouldReturnTrueIfSplitMessage(){

        ShortMessage shortMessage = new ShortMessage();

        String str = "I am a love cats and dogs but not the flees they carry. Also i think that cats are sometimes" +
                " rude because they do not hug me when i want them too. " +
                "Overall though cats and dogs are both great.";

        System.out.println(shortMessage.createSMS(str));

    }

    @Test
    public void shouldReturnReverseString(){
        ShortMessage shortMessage = new ShortMessage();
        System.out.println(shortMessage.reverseString("foo boo"));
    }
}
