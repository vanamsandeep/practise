import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        String s = "hyyaue";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i), 0);
            } else {
                if (map.get(s.charAt(i)) != null) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                }
            }
        }
       // map.entrySet()

    }
}
