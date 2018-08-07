package word.model;

public final class Word {
    private final String givenWord;

    public Word(String givenWord) {
        this.givenWord = givenWord.toLowerCase();
    }

    public String getGivenWord() {
        return givenWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return getGivenWord().equalsIgnoreCase(word.getGivenWord());
    }

    @Override
    public int hashCode() {
        return getGivenWord().hashCode();
    }
}

