package com.stackroute.pe4main;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PresenceOfHarry {

    public boolean checkPresence(String sentence){
        if(sentence!=null){
            //the pattern to be checked
            Pattern p = Pattern.compile("Harry");
            //the pattern to be matched with the sentence string
            Matcher m = p.matcher(sentence);
            //if pattern exists in sentence then true
            if (m.find()) return true;
            else return false;
        }
        //if null
        else
            return false;
    }
}
