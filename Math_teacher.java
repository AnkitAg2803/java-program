class Faculty 
{

  String designation = "Assistant Professor";
  String college_Name = "CIMAGE Group of Institutions,PATNA";
 
}

public class  Math_teacher extends Faculty
   {
  String mainSubject = "MATHMATICS";
  public static void main(String args[]) {
  Math_teacher obj = new Math_teacher ();
    
    System.out.println(obj.college_Name);
    System.out.println(obj.designation);
    System.out.println(obj.mainSubject);
  }
}
