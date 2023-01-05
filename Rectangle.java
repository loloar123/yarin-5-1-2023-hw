package date5_1_23_Yarin.hw;

public class Rectangle {

//    creating 2 private variables for the rectangle
//    at the beginning i thought it would take 4 variables
//    in order to create the functions, but it doesn't'
    private int a;
    private int b;

//    creating the Constructor
    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
//    creating copier constructor
   public Rectangle(Rectangle other){
        this.a = other.a;
        this.b = other.b;
   }
//   creating default constructor
    public Rectangle(){
        this.a = 5;
        this.b = 12;
    }
//    overriding the 'toString()' method in order to print what i want
    @Override
    public String toString() {
        return "Rectangle{'a' side= " + a + ", 'b' side= " + b + "}";
    }
//    defining getA method
    public int getA(){
        return a;
    }
//    defining setA method
    public void setA(int a){
        this.a = a;
    }
// defining getB method
    public int getB(){
        return b;
    }
//    defining setB method
    public void setB(int b){
        this.b = b;
    }

//    creating a method in order to
//    find the are of the Rectangle
    public int getArea(){
        return 2*(this.a + this.b);
    }
//    creating a method in order to
//    find the perimeter of the Rectangle
    public int getPerimeter(){
        return this.a * this.b;
    }
}
