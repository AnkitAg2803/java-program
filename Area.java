import java.util.Scanner;
public class Area
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("1.Area of Rectangle");
      System.out.println("2.Area of circle");
      System.out.println("3.Area of Square");
      System.out.println(" enter any chioce : ");
      int num = sc.nextInt();
      switch(num)
      {
 case 1: System.out.println("enter length and breadth of rectangle: ");
         int length = sc.nextInt();
         int breadth = sc.nextInt();
         int area_Rectangle = length * breadth;
         System.out.println("Area of rectangle is: " + area_Rectangle);
         break;
         case 2: System.out.println(" enter radius of circle: ");
         double radius = sc.nextFloat();
         double area_Circle = (22 * radius * radius) / 7;
         System.out.println("Area of circle is: " + area_Circle);
         break;
         case 3: System.out.println(" enter side of square: ");
         int side = sc.nextInt();
         int area_square = side*side;
         System.out.println("Area of square is: " + area_square);
         break;
         default:System.exit(0);
      }
      sc.close();
   }
}