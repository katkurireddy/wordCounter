package word.reader;

import word.wordMap.WordCountMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static word.util.WordCounterUtil.validateWord;

public final class ConsoleReader implements WordReader {
    private final WordCountMap wordCountMap;

    public ConsoleReader(WordCountMap wordCountMap) {
        this.wordCountMap = wordCountMap;
    }

    public String read() throws IOException {
        System.out.println("Enter 1 to add the word and 2 to retrieve the count");
        try (BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {
            String entered;
            while (!(entered = stdIn.readLine()).equals("exit")) {
                if (entered.equals("1")) {
                    System.out.println("Enter the word");
                    while (true) {
                        String word = stdIn.readLine();
                        if (validateWord(word)) {
                            wordCountMap.addWord(word.trim());
                            break;
                        } else {
                            System.out.println("Please enter a valid input. Alphabet only");
                        }
                    }
                } else if (entered.equals("2")) {
                    System.out.println("Enter the word to retrieve the count");
                    while (true) {
                        String word = stdIn.readLine();
                        if (validateWord(word)) {
                            int count = wordCountMap.retrieveCount(word.trim());
                            System.out.println(word + " Count: " + count);
                            break;
                        } else {
                            System.out.println("Please enter a valid input. Alphabet only");
                        }
                    }
                }
                System.out.println("Enter 1 to add the word and 2 to retrieve the count");
            }

        }
        return "";
    }
}
