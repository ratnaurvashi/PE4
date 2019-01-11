package com.stackroute.pe4main;

public class TransposeString {
    public String transposeString(String word){
        String result="";
        StringBuilder sb=new StringBuilder();
        for(int i=word.length()-1;i>=0;i--){
            sb.append(word.charAt(i));
        }
        //converting stringbuilder sb to string;
        result=sb.toString();
        //splitting the result string and putting in string array
        String string[]=result.split(" ");
        int i=string.length-1;
        result=string[i];
        for (i=string.length-2;i>=0;i--){
            result=result+" " +string[i];
        }
        return result;
    }
}
