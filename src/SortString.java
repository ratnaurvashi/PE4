import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortString {
    public List<String> sortString(String paragraph){
        List<String> wordlist = new ArrayList<>();
        if(paragraph!=null) {
            String[] words = paragraph.split(" ");
            for(int i=0;i<words.length;i++)
                wordlist.add(words[i]);
            Collections.sort(wordlist);
        }
        else{
            wordlist.add("invalid");
        }
        return wordlist;
    }
}
