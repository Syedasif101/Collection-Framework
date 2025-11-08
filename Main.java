import java.lang.reflect.Field;
import java.util.*;


class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

// 5 3


class StringComparator implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}

// apple berries

public class Main{
    public static void main(String[] args) throws Exception{

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(1);

//        list.remove(Integer.valueOf(5));

//        System.out.println(list);

        list.sort(new MyComparator());

        System.out.println(list);

        List<String> names = new ArrayList<>();


        names.add("Shah asifa Ayoub");
        names.add("Suhaila syed");
        names.add("Syed rubiya");
        names.add("Syed insha");
        names.add("Syed tawqueer");


//        names.sort(null);
//
//        System.out.println(names);


        names.sort(new StringComparator());

        System.out.println(names);





        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(4);
        integers.add(6);
        integers.add(8);
        integers.add(10);
        integers.add(12);

        integers.sort((a,b) -> {

            return b - a;

        });

        System.out.println(integers);













//        names.remove("insha");

//        System.out.println(names);


//        Collections.sort(list);




//        // Convert to array
//
//        Object[] array = list.toArray();
//
//        Integer[] array1 = list.toArray(new Integer[0]);






//        for(Object x : array)
//        {
//            System.out.print(x);
//        }


//        List<Integer> list = new ArrayList<>(5);
//
//        System.out.println(list.getClass().getName());
//
//       List<String> list2 =  Arrays.asList("Sunday", "Monday");
////        System.out.println(list2.getClass().getName());
//
//        list2.set(1,"Saturday");
//
//        System.out.println(list2);
////        list2.add("Tuesday"); // Cannot do this cause Arrays.asList is of fixed size
////        System.out.println(list2);
//
//        String[] names = {"Faheem", "Saika", "Witty","Rifat"};
//        List<String> namesList = Arrays.asList(names);
//        System.out.println(namesList);
//
//
////        if we want to make the namesList modifiable we can do that
//
//        List<String> modifiableList = new ArrayList<>(namesList);
//
//        modifiableList.add("Isha");
//        modifiableList.add("Isma");
//        modifiableList.add("Ayesha");
//
//
//        System.out.println(modifiableList);
//
//        List<Integer> list3 = List.of(1, 2, 3, 4, 5);
//        ArrayList<Integer> modifyList = new ArrayList<>(list3);
//
//        modifyList.add(10);
//        modifyList.add(11);
//        modifyList.add(12);
//
//        System.out.println(modifyList);
//        list3.set(2,9);

//        The difference between asList() and List.of() is that we can atleast replace items in Arrays.asList()
//        But we cannot replace the elements in List.of()


//        Field field = ArrayList.class.getDeclaredField("elementData");
//        field.setAccessible(true);
//        Objects[] elementsData = (Objects[]) field.get(list);
//        System.out.println("ArrayList Capacity: " + elementsData.length);
//
















//        list.add(2,50);
//        list.remove(2);
//        for(int x: list)
//        {
//            System.out.println(x);
//        }




















//        System.out.println(list.get(2));
//        System.out.println(list.size());
//
//
//        for(int x: list)
//        {
//            System.out.println(x);
//        }
//
//        System.out.println(list.contains(5));
//        System.out.println(list.contains(50));

    }
}
