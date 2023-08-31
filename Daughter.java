class Grandfather
{
  void showG()
  {
    System.out.println("grandfather loves granson & granddaughter");
  }
}
class Father extends Grandfather
{
    void showF()
    {
        System.out.println(" father love his child a lot");
    }
}
class Son extends Father
{
void showS()
  {
System.out.println("son love their parents");
  }
}
public class Daughter extends Father
{
    void showD()
    {
        System.out.println("daughter is always papa's favourite");
    }
 public static void main(String[] args)
  {
    Son obj1 = new Son();
    obj1.showS();
    obj1.showG();
    obj1.showF();
    Daughter obj2= new Daughter();
    obj2.showD();
    obj1.showG();
    obj1.showF();
 }  
}
