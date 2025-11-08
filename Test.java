interface Printable {

    void print();
}

class MyNumber extends Number implements Printable{
    private final int value;

    public MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void print() {

        System.out.println("MyNumber is: " + value);

    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

class Boxx<T extends Number & Printable>{
    private T item;

    public Boxx(T item) {
        this.item = item;
    }


    public void print() {
        item.print();
    }

}


public class Test {
    public static void main(String[] args) {
        MyNumber mynumber = new MyNumber(12);
        Boxx<MyNumber> box = new Boxx<>(mynumber);
        box.print();

    }
}
