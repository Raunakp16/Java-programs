import java.util.HashSet;
import java.util.TreeSet;

public class HashTreeSetDemo {
    public static void main(String[] args){
        // HashSet Demonstration
        HashSet<Integer> hs = new HashSet<>();
        hs.add(25);
        hs.add(10);
        hs.add(30);
        hs.add(40);

        hs.add(10); // duplicate element

        System.out.println(" Hashset elements ");
        System.out.println(hs);

        // TreeSet Demonstration
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(25);
        ts.add(10);
        ts.add(30);
        ts.add(40);

        ts.add(10); // Duplicate value

        System.out.println(" TreeSet elements: ");
        System.out.println(ts);
    }

}
