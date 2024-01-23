import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regex {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("Amazon",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Amazonian isn't a river, they are people from myths!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }

}
