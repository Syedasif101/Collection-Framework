import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnWriteDemo {

    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//
//        list.add("Apples");
//        list.add("Mangoes");
//        list.add("Apricots");
//        list.add("Eggs");
//
//        for(String s : list)
//        {
//            if(s.equals("Eggs"))
//            {
//                list.add("Butter"); // throws exceptions ConcurrentModificationException This can be solved using
//                // copyOnWriteArray List cause its thread safe and creates a new copy everytime we modify our list
//                System.out.println("Butter added");
//            }
//        }
//
//        System.out.println(list);
//



        List<String> list2 = new CopyOnWriteArrayList<>();

        list2.add("Apples");
        list2.add("Mangoes");
        list2.add("Peaches");
        list2.add("Pears");
        list2.add("Bread");

        for(String s: list2)
        {
            if(s.equals("Bread"))
            {
                list2.add("Butter");
            }
        }


        System.out.println(list2);










    }
}
