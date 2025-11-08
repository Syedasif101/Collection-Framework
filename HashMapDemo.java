import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
//    1. HashMap doesn't follow the order
//    2. Can have one null key and multiple null values
//    3. Not Synchronized: Not thread safe, requires external synchronization
//        if used in a multi-Threaded context
//    4. Offers constant- time performance O(1) for basic operations like
//        like get and put, assuming the hash function disperses elements properly
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Danish Nazir");
        map.put(10, "Isha vats");
        map.put(12, "Rahull Bhat");
        map.put(14, "Insha Syed");
        map.put(16, "Meer Faheem Ali");

//        System.out.println(map);

        String student = map.get(14);
//        System.out.println(student);

//        System.out.println(map.get(69)); // null

//        System.out.println(map.containsKey(69)); // false

//        System.out.println(map.containsKey(14));

        // iterate through map

//        Set<Integer> m = map.keySet();

//        for(int i : map.keySet())
//        {
//            System.out.println(map.get(i));
//        }

        // iterate using entrySet();

//        Set<Map.Entry<Integer,String>> entries = map.entrySet();
//
//        for(Map.Entry<Integer,String> entry: entries)
//        {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

//        Iterate using Map.Entry();

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for(Map.Entry<Integer, String> entry : entries){
            entry.setValue(entry.getValue().toUpperCase());
        }

        Set<Integer> integers = map.keySet();

        for(int m : integers)
        {
            System.out.print(map.get(m) + " ");
        }



    }
}
