package com.stackroute.pe4main;

public class ReplaceChars {
    //method for replacing d with f and l with t
    public String replace(String sentence){
        //checking for null
        if(sentence!=null) {
            //replacing d with f
            String tempsentence = sentence.replaceAll("d", "f");
            //replacing l with t
            tempsentence = tempsentence.replaceAll("l","t");
            //replacing D with F
            tempsentence = tempsentence.replaceAll("D","F");
            //replacing L with T
            String newsentence = tempsentence.replaceAll("L","T");
            return newsentence;
        }
        //if null
        else
            return "invalid";
    }
}
