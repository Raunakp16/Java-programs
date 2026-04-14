import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args){

        // Creating Hashmap
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(101,"Alice");
        hashMap.put(103,"Charlie");
        hashMap.put(102,"Bob");
        hashMap.put(101,"David");  // Duplicate key

        System.out.println(" HashMap Elements :");
        System.out.println(hashMap);

        // Removing elements
        hashMap.remove(103);

        System.out.println(" HashMap after removing key 103: ");
        System.out.println(hashMap);

        // iterating hashmap
        System.out.println("\n Iterating Hashmap : ");
        for (Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Creating TreeMap
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(101,"Alice");
        treeMap.put(103,"Charlie");
        treeMap.put(102,"Bob");
        treeMap.put(101,"David"); // Duplicate value

        System.out.println(" \n  TreeMap elements sorted by keys ");
        System.out.println(treeMap);

        // Removing element
        treeMap.remove(103);

        System.out.println("\n Treemap elements after removing key 103 ");
        System.out.println(treeMap);

        // Iterating loop
        System.out.println("\n Iterating TreeMap :");
        for (Map.Entry<Integer,String>entry:treeMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }




    }
}
