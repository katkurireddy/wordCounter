package word.model;

import java.util.List;

/*Maintains a list of all the words that translates to the English word key*/
public final class ForeignWords {
    private final List<Word> words;

    public ForeignWords(List<Word> words) {
        this.words = words;
    }

    public List<Word> getWords() {
        return words;
    }

    public void addWord(Word word) {
        for (Word fword : words) {
            if (word.equals(fword)) {
                return;
            }
        }
        words.add(word);
    }

    public int getCount(Word word) {
        for (Word fword : words) {
            if (word.equals(fword)) {
                return words.size();
            }
        }
        return 0;
    }
}
