import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PresenceOfHarry {

    public boolean checkPresence(String sentence){
        if(sentence!=null){
            Pattern p = Pattern.compile("Harry");
            Matcher m = p.matcher(sentence);
            if (m.find()) return true;
            else return false;
        }
        else
            return false;
    }
}
