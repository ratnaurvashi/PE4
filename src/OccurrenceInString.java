public class OccurrenceInString {
    public int countOccurrence(String sentence, String alphabet){
        if(sentence!=null && alphabet!=null) {
            int charcount = sentence.length() - sentence.replace(alphabet, "").length();
            return charcount;
        }
        else
            return 0;
    }
}
