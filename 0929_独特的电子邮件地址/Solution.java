
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author winter
 * @date 2019/9/6 23:19
 */
public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> res = new TreeSet<>();
        for (String email : emails) {
            int i = email.indexOf('@');
            String local = email.substring(0,i);
            String ret = email.substring(i);
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            local = local.replace(".","");
            res.add(local + ret);
        }
        return res.size();
    }
}
