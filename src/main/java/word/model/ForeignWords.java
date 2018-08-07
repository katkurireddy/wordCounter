package word.model;

import java.util.Set;

/*Maintains a Set of all the words that translates to the English word key*/
public final class ForeignWords {

    private final Set<Word> words;

    public ForeignWords(Set<Word> words) {
        this.words = words;
    }

    public Set<Word> getWords() {
        return words;
    }

    public void addWord(Word word) {
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
