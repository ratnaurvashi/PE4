package com.stackroute.pe4main;

public class OccurrenceInString {
    //method for counting occurrence of a character in a sentence
    public int countOccurrence(String sentence, String alphabet){
        //checking if not null
        if(sentence!=null && alphabet!=null) {
            //charcount stores count of character
            int charcount = sentence.length() - sentence.replace(alphabet, "").length();
            return charcount;
        }
        //if null
        else
            return 0;
    }
}
