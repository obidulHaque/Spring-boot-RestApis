import  java.util.List;
import  java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("joy");
        names.add("obaidul");
        names.add("Haque");
        System.out.println(names);
        System.out.println(names.get(2));

        for (String name : names) {
            System.out.println(name);
        }
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        System.out.println(map);
    }
}