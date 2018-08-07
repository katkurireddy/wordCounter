package word.wordMap;

import org.junit.Before;
import org.junit.Test;
import word.model.ForeignWords;
import word.model.Word;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class WordCountMapTest {

    private WordCountMap wordCountMap;

    @Before
    public void setup() {
        Map<Word, ForeignWords> map = new HashMap<>();
        wordCountMap = new WordCountMap(map);
    }

    @Test
    public void addWordTest() {
        wordCountMap.addWord("tango");
        wordCountMap.addWord("Tango");
        wordCountMap.addWord("banana");
        assertEquals(1, wordCountMap.retrieveCount("tango"));
        assertEquals(1, wordCountMap.retrieveCount("banana"));
        assertEquals(1, wordCountMap.retrieveCount("Tango"));
    }
}
