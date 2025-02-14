package interfaces;

public class Rectangle implements Polygon{
    @Override
    public void getArea(int length, int width) {
        System.out.println("Area of rectangle is " + (length * width));
    }
}
