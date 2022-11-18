import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.io.IOException;
public class DifferentWordsOccurrence {
    static void printDifferentWords(String String) {
        HashMap<String, Integer> WordMap = new LinkedHashMap<>();
        String[] Words = String.split("\\W");
        for (String Word : Words) {
            if (WordMap.containsKey (Word.toLowerCase())) {
                WordMap.put (Word.toLowerCase(), WordMap.get (Word.toLowerCase()) + 1);
            }
            else
                WordMap.put (Word.toLowerCase(), 1);
        }

        System.out.println("Всі слова та їх частота: ");
        for (Map.Entry<String, Integer> EntryWord : WordMap.entrySet() ) {
            System.out.println (EntryWord.getKey() + ": " + (float) EntryWord.getValue() / 583);
        }
    }
    public static void main(String[] args) throws IOException {
        Path FilePath = Path.of("C:\\Users\\kalam\\Desktop\\университет\\OOP\\№8\\lr-8\\random txt.txt");
        String Words = Files.readString(FilePath);
        printDifferentWords(Words);
    }
}