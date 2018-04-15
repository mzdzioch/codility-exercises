package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

    public int countWord(String source, String word){
        int count = 0;

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(source);


        while(matcher.find()){
            count++;
        }

        return count;
    }


}
