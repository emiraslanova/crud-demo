public class Kvadrat implements Shape{

    private double side;

    @Override
    public double getArea() {
        return side*side;
    }
}
