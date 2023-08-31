 class Calci
 {
    void sum(int a,int b)
    {
    System.out.println("sum is" + (a+b));
    }
    void sub(int a,int b)
    {
    System.out.println("subtraction is" + (a-b));
    }
}
 public class Calculator extends Calci
{
    void multiply(int a,int b)
    {
    System.out.println("multiplication is" + (a*b));
    }
    void divide(int a,int b)
    {
        System.out.println ("divison is" + (a/b));
    }

public static void main(String[] args) 
{
    Calculator C1 = new Calculator();
    C1.sum(10,20);
    C1.sub(100,20);
    C1.multiply(10,20);
    C1.divide(10,2);
}
}
