package word.model;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WordTest {

    @Test
    public void wordEqualityTest() {
        Word w1 = new Word("Tango");
        Word w2 = new Word("tango");
        assertEquals(w1, w2);
    }
}
