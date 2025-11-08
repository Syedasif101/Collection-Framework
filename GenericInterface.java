public class GenericInterface{
    public static void main(String[] args) {
        GenericsContainer<String> g = new GenericsContainer<>();

        g.add("hey Good Morning");
        String greeting = g.get();
        System.out.println(greeting);

    }
}
