import java.util.*;

class student{
    int id;
    String name;

    student(int id,String name){
        this.id=id;
        this.name=name;
    }
}


public class SortExample {
    public static void main(String[] args){

        ArrayList<student> list = new ArrayList<>();

        // Adding elements to ArrayList
        list.add(new student(110,"Nirma"));
        list.add(new student(55,"Raunak"));
        list.add(new student(32,"Jayesh"));

        // Sorting by id using comparator
        Collections.sort(list, new Comparator<student>() {
            @Override
            public int compare(student s1, student s2) {
                return s1.id- s2.id;
            }
        });
        System.out.println("Sorting by Id :");
        for (student s:list){
            System.out.println(s.id + " "+ s.name);
        }

        // Sorting by name using Comparator
        Collections.sort(list, new Comparator<student>() {
            @Override
            public int compare(student s1, student s2) {
                return s1.name.compareTo(s2.name) ;
            }
        });
        System.out.println("Sorting by name :");
        for (student s:list){
            System.out.println(s.id + " " + s.name);
        }
    }
}
