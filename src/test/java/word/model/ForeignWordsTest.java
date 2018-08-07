package word.model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ForeignWordsTest {

    private ForeignWords foreignWords;

    @Before
    public void setup() {
        List<Word> words = new ArrayList<>();
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
