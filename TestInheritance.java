class Vechicle {
    void petrol()
    {
    System.out.println("petrol");
  }
  }
  class CAR extends Vechicle
  {
      void CNG()
      {
          System.out.println("CNG");
      }
  }
  class TestInheritance
  {
   
      public static void main(String[] args)
      {
          CAR c1= new CAR();
          c1.petrol();
          c1.CNG();
      }
  }