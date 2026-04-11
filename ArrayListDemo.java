import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){
        // Creating an arraylist
        ArrayList <String> fruits = new ArrayList<>();

        // Adding elememts to arraylist
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Oranmge");

        System.out.println(" After adding: ");
        System.out.println(fruits);

        //Removing elements
        fruits.remove(" Bananna");

        System.out.println("\n After removing  'banana' ");
        System.out.println(fruits);

        // iterating using for each loop
        System.out.println(" \n Iterating through ArrayList : ");
        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
