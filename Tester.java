class Shape {
    public void display() {
       System.out.println("Different shapes");
    }
 }
 class Rectangle extends Shape {
    public void area() {
        System.out.println(" rectangle");
       System.out.println("Area of rectangle");
    }
 }
 class Cube extends Rectangle {
    public void volume() {
        System.out.println("cube");
       System.out.println(" volume of cube");
    }
}
    
 public class Tester {
    public static void main(String[] arguments) {
       Cube cube = new Cube();
       cube.display();
       cube.area();
       cube.volume();
       
    }
 }
    
