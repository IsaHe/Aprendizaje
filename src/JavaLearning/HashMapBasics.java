package JavaLearning;

import java.util.HashMap;

public class HashMapBasics {
    public static void main(String[] args) {
        //HashMaps are a type of map, which is an object that maps keys to values.
        //A map cannot contain duplicate keys; each key can map to at most one value.
        //HashMaps are not sorted.
        //HashMaps are not thread-safe.
        //HashMaps are not synchronized.
        //HashMaps are not guarantee

        HashMap<String, String> map = new HashMap<>();

        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");
        map.put("5", "Five");

        map.remove("3");
        System.out.println(map.get("5"));
        //map.clear();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.replace("4", "FourFour");
        System.out.println(map.containsKey("4"));
        System.out.println(map.containsValue("FourFour"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.putIfAbsent("3", "Three");
        System.out.println();

        for (String key : map.keySet()) {
            System.out.println(key + "\t:\t" + map.get(key));
        }
    }
}
