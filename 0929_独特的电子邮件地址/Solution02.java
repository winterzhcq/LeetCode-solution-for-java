
import java.util.HashSet;
import java.util.Set;

/**
 * @author winter
 * @date 2019/9/7 9:25
 */
public class Solution02 {
    public int numUniqueEmails(String[] emails) {
        Set<String> normalized = new HashSet<>();
        for (String email : emails) {
            String[] part = email.split("@");
            String[] local = part[0].split("//+");
            normalized.add(local[0].replace(".","")+"@"+part[1]);
        }
        return normalized.size();
    }
}
