package com.stackroute.pe4main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortString {
    public List<String> sortString(String paragraph){
        List<String> wordlist = new ArrayList<>();
        if(paragraph!=null) {
            String[] words = paragraph.split(" ");
            for(int i=0;i<words.length;i++)
                //adding words from paragraph to list
                wordlist.add(words[i]);
            //sorting the list
            Collections.sort(wordlist);
        }
        //if null
        else{
            wordlist.add("invalid");
        }
        return wordlist;
    }
}
