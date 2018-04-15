package strings;

public class CharCount {

    public long countChars(String string, char word){
        return string.chars().filter(s -> s == word).count();
    }
}
