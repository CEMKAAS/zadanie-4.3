import java.util.HashMap;
import java.util.Map;

public class Main {

    public static String name = "lorel";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            char aChar = name.charAt(i);
            if(Character.isLetter(aChar)){
                for (Character key : map.keySet()) {
                    char a =;
                    a.equals(map.get(key));

                }
                map.put(aChar,x);
            }
        }
        System.out.println(map.values());
    }
}
