package word.util;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static word.util.WordCounterUtil.validateWord;

public class WordCounterUtilTest {

    @Test
    public void validateWordTest() {
        assertTrue(validateWord("tango"));
        assertTrue(validateWord("TaNgo"));
        assertFalse(validateWord("t12ango"));
        assertFalse(validateWord(""));
        assertFalse(validateWord(" "));
        assertFalse(validateWord(null));
    }
}
