package word.util;

import org.apache.commons.lang3.StringUtils;

public class WordCounterUtil {

    /*Returns true only if the word is formed of alphabet and is not null or empty*/
    public static boolean validateWord(String word) {
        return StringUtils.isNotBlank(word) && word.matches("[a-zA-Z]+");
    }
}
