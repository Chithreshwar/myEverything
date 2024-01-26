package practice;

public class Application {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Point pt = new Point();
        pt.x = 0;
        pt.y = 6;
        rectangle.topLeft = pt;
//        rectangle.topLeft.x = 0;
//        rectangle.topLeft.y = 6;
        rectangle.length = 10;
        rectangle.width = 4;
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getBottomRight());
    }
}
