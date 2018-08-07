package word.model;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class ForeignWordsTest {

    private ForeignWords foreignWords;

    @Before
    public void setup() {
        Set<Word> words = new HashSet<>();
        foreignWords = new ForeignWords(words);
    }

    @Test
    public void addWordTest() {
        foreignWords.addWord(new Word("tango"));
        assertEquals(1, foreignWords.getCount(new Word("tango")));
        foreignWords.addWord(new Word("Tango"));
        assertEquals(1, foreignWords.getCount(new Word("tango")));

    }
}
