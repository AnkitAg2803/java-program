public class Data
 {
    String first_Name;
    String last_Name;
    int age;
   
   
    public Data(){
        first_Name = "ANKIT";
        last_Name = "AGRAWAL";
        age = 19;
        
    }
    
    public static void main(String args[]) {
        Data d = new Data();
        System.out.println(d.first_Name);
        System.out.println(d.last_Name);
        System.out.println(d.age);
        
        
        
    }
  }
  
  
  
  