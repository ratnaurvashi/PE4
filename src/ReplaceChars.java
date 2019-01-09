public class ReplaceChars {
    public String replace(String sentence){
        if(sentence!=null) {
            String tempsentence = sentence.replaceAll("d", "f");
            tempsentence = tempsentence.replaceAll("l","t");
            tempsentence = tempsentence.replaceAll("D","F");
            String newsentence = tempsentence.replaceAll("L","T");
            return newsentence;
        }
        else
            return "invalid";
    }
}
