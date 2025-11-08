class Box1 <T extends Number> {

    private T length;
    private T breadth;

    public Box1(T length, T breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public T getLength() {
        return length;
    }

    public T getBreadth() {
        return breadth;
    }

    double operate()
    {
        return length.doubleValue() * breadth.doubleValue();
    }
}



public class BoundedGenerics {

    public static void main(String[] args)
    {
        Box1<Integer> box = new Box1<>(20, 30);
        Box1<Double> box2 = new Box1<>(4.56, 10.3);

        double result = box.operate();
        System.out.println(result);

        double result2 = box2.operate();
        System.out.println(result2);


    }
}
