
import java.util.ArrayList;
import java.util.List;

public class OrderedStream {
    String[] stream;
    int ptr = 0;
    public OrderedStream(int n) {
        stream = new String[n];
    }

    public List<String> insert(int id, String value) {
        stream[id-1] = value;
        List<String> result = new ArrayList<>();
        for (int i = ptr;i< stream.length;i++){
            if (stream[i] == null) break;
            ptr++;
            result.add(stream[i]);
        }
        return result;
    }
}
