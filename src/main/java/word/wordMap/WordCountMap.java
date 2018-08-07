package word.wordMap;

import word.model.ForeignWords;
import word.model.Word;
import word.translate.Translator;

import java.util.*;

public class WordCountMap {

    private final Map<Word, ForeignWords> wordsMap;

    public WordCountMap(Map<Word, ForeignWords> wordsMap) {
        this.wordsMap = wordsMap;
    }

    public void addWord(String word) {
        Word given = new Word(word);
        Word translatedWord = new Word(Translator.translate(word));
        if (wordsMap.containsKey(translatedWord)) {
            wordsMap.get(translatedWord).addWord(given);
        } else {
            Set<Word> fwords = new HashSet<>();
            fwords.add(given);
            wordsMap.put(translatedWord, new ForeignWords(fwords));
        }
        System.out.println(word + " has been added");
    }

    public int retrieveCount(String word) {
        Word given = new Word(word);
        Word translatedWord = new Word(Translator.translate(word));
        if (wordsMap.containsKey(translatedWord)) {
            return wordsMap.get(translatedWord).getCount(given);
        }
        return 0;
    }
}
