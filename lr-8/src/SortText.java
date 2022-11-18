import java.nio.file.Files;
import java.util.ArrayList;
import java.nio.file.Path;
import java.util.Collections;

public class SortText 
{
    public static void main(String[] args) throws Exception 
    {
        Path FilePath = Path.of("C:\\Users\\kalam\\Desktop\\университет\\OOP\\№8\\lr-8\\random txt.txt");
        String Words = Files.readString(FilePath);
        
        ArrayList<String> WordList = new ArrayList<>();

        for (String temp: Words.split("\\.") )
        { WordList.add(temp.strip() ); }

        Collections.sort(WordList); // сортуємо за алфавітом;
        for (String temp: WordList)
        { System.out.println(temp + "."); }
    }
}