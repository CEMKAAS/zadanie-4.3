import java.util.HashMap;
import java.util.Map;

public class Main {

    public static String name = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            char aChar = name.charAt(i);
            if (Character.isLetter(aChar)) {
                if (map.get(aChar) == null) {
                    map.put(aChar, 1);
                } else {
                    int y = map.get(aChar);
                    y++;
                    map.put(aChar, y);
                }
            }
        }
               // map.put(aChar,x);
        for (Map.Entry<Character, Integer> kv : map.entrySet()){
            System.out.println(kv.getKey() + " " + kv.getValue());

        }
        }
        //System.out.println(map.values());
    }
