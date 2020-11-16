public class Circletest {
    public static void main(String[] args) {
        Circle circle= new Circle();
        System.out.println(circle);
        circle =new Circle(3.5);
        System.out.println(circle.getArea());
//        System.out.println(circle);
//        circle=new Circle("indogo", false, 3.5);
//        System.out.println(circle);
        circle.resize(100);
    }
}
