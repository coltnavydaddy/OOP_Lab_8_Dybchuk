import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.*;
public class DifferentWordsWithoutRepeat {
    static void printWords(String string) {

        String[] words = string.split("\\W");
        List<String> allWords = new ArrayList<>(Arrays.asList(words) ); // створюємо Ліст з ерею;
        for(String word:allWords) {
            // Якщо слово зустрічається 1 раз,
            if (Collections.frequency (allWords,word) == 1)
            {
                // виводимо його;
                System.out.println (word);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Path FilePath = Path.of("C:\\Users\\kalam\\Desktop\\университет\\OOP\\№8\\lr-8\\random txt.txt");
        String string = Files.readString (FilePath);
        printWords (string);
    }
}
