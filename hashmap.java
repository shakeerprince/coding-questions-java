import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        
        HashMap<String,Integer> map = new HashMap<>();

        map.put("shaker", 71);
        map.put("hello", 11);
        map.put("hi", 00);

        System.out.println(map.get("shaker"));

    }
}
