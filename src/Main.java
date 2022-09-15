import java.util.HashMap;
import java.util.Map;

public class Main {

    public static String name = "llloll";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            char aChar = name.charAt(i);
            int x=0;
            if(Character.isLetter(aChar) && map.put(aChar,1) == null){
                x=1;
                map.put(aChar,x);
            }else {
                x=map.get(aChar);
                x++;
                map.put(aChar,x);
            }
        }
               // map.put(aChar,x);
        for (Map.Entry<Character, Integer> kv : map.entrySet()){
            System.out.println(kv.getKey() + " " + kv.getValue());

        }
        }
        //System.out.println(map.values());
    }
