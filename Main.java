package date5_1_23_Yarin.hw;

public class Main {
    public static void main(String[] args) {
//    defining a Rectangle with values of a=2,b=8
        Rectangle a = new Rectangle(2,8);
//    copying the values from the first Rectangle
        Rectangle b = new Rectangle(a);
//    defining a Rectangle with default values
        Rectangle c = new Rectangle();
//    printing the Area of the first Rectangle
        System.out.println(a.getArea());
//    printing the perimeter of the first Rectangle
        System.out.println(a.getPerimeter());
//    setting the value of the first Rectangle to 4
        a.setA(4);
//    printing the second(b) Rectangle
        System.out.println(b);
//    printing the first(a) Rectangle after change of value
        System.out.println(a);
//    printing the third(c) Rectangle
        System.out.println(c);
    }
}
