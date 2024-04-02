public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(2.5);
        circles[1] = new Circle(3.75);
        circles[2] = new Circle(2.75);

        java.util.Arrays.sort(circles);

        for (Circle c : circles)
            System.out.println("Circle: radius = " + c.getRadius() + ", area = " + c.getArea());
    }
}
