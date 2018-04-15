package strings;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortMessage {

    public final int MESSAGE_LIMIT = 19;

    public List<String> solution(String message){
        List<String> messages = new ArrayList<>();
        String[] stringArray = message.split(" ");
        String str = "";
        int count = 0;

        for (int i = 0; i < stringArray.length; i++) {

            count += stringArray[i].length() + 1;

            if(count > MESSAGE_LIMIT) {
                messages.add(str);
                count = stringArray[i].length() + 1;
                str = "";
            }
            str += stringArray[i] + " ";
        }

        return messages;
    }

    public String createSMS(String message){

        char[] chars = message.toCharArray();
        String sb = "";
        String word = "";
        int count = 0;

        for (int i = 0; i < chars.length; i++) {

            if((chars[i] == ' ') && count > MESSAGE_LIMIT){
                sb += "\n";
                count = word.length();
                sb += word + " ";
                word = "";

            } else if(chars[i] == ' '){
                sb += word + " ";
                word = "";
                count++;
            } else {
                word += chars[i];
                count++;
            }

        }

        return sb.toString();
    }

    public String reverseString(String str){

         return  Arrays.stream(str.split(" "))
                 .map(p -> new StringBuilder(p).reverse().toString())
                 .reduce("", (p1, p2) -> p1.isEmpty() ? p2 : p1 + " " + p2);

    }
}
