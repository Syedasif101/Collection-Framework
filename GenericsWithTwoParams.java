class Pair<K, V>{

    private K key;
    private V value;

    Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

}

public class GenericsWithTwoParams {

    public static void main(String[] args)
    {

        Pair<String,Integer> p = new Pair<>("Age:", 30);
        String age = p.getKey();
        int value = p.getValue();

        System.out.println(age + " " + value);

    }
}
