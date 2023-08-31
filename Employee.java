public class Employee {
    private String name;
    private int id;
    private int salary;
    public Employee(String n, int i, int s) {
        name = n;
        id = i;
        salary = s;
    }
     Employee(Employee e) {
        name = e.name;
        id = e.id;
        salary = e.salary;
    }
    public void display() {

        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("John", 10001, 20000);
        Employee e2= new Employee("sohan",1002,390000);
        
   e1.display();
  e2.display();
 
        
        Employee e3 = new Employee(e1);
        System.out.println("Display Employee details   via copy constructor.");
        e3.display();
         Employee e4 = new Employee(e2);
         System.out.println("Display Employee details via copy constructor."); 
        e4.display();
    }
}
