class Box<T>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}


public class Generics {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(200);
        int i = box.getValue();

        System.out.println(i);


        Box <String> box1 = new Box<>();

        box1.setValue("Syeda");
        String name = box1.getValue();
        System.out.println(name);




    }
}
