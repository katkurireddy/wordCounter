package word;

import word.model.ForeignWords;
import word.model.Word;
import word.reader.ConsoleReader;
import word.reader.WordReader;
import word.wordMap.WordCountMap;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounterApp {

    public static void main(String[] args) throws IOException {
        Map<Word, ForeignWords> wordsMap = new HashMap<>();
        WordCountMap wordCountMap = new WordCountMap(wordsMap);
        WordReader reader = new ConsoleReader(wordCountMap);
        reader.read();
    }
}
