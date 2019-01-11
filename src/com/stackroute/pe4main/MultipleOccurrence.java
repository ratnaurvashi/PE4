package com.stackroute.pe4main;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrence{
    public List<String> findOccurrence(String sentence, String patternString){
        List<String> indexes = new ArrayList<>();
        if(sentence!=null && patternString!=null) {
            //pattern to be matched
            Pattern pattern = Pattern.compile(patternString);
            //matcher to match pattern with string
            Matcher matcher = pattern.matcher(sentence);
            //storing the occurrences as string in a list
            while (matcher.find()) {
                indexes.add(String.valueOf(matcher.start()));
                indexes.add("-");
                indexes.add(String.valueOf(matcher.end()));
            }
        }
        //null condition check
        else{
            indexes.add("invalid");
        }
        return indexes;
    }
}
