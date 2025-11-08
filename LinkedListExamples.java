import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExamples {

    public static void main(String[] args) {
       LinkedList<Integer> list = new LinkedList<>();

       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
//     System.out.println(list);
//     System.out.println(list.get(0));

//        list.remove(1);
//
//        System.out.println(list);

//        list.set(1, 2);
//        System.out.println(list);

        list.add(1,2);
        System.out.println(list);

        list.addFirst(0);
        list.addLast(6);

        System.out.println(list);


        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));

        LinkedList<String> animalsRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));

        animals.removeAll(animalsRemove);

        System.out.println(animals);



    }
}
