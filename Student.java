import java.util.Scanner;
public class Student
{
    private int roll_no,marks;
    private String name;
    private String subject;
    public void get_performance()
    {
        System.out.println("Name  " +name);
        System.out.println("ROLL_NO  " +roll_no);
        System.out.println("Marks  " +marks);
        System.out.println("Subject  " +subject);
    }
    public void set_performance()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name:");
        name = sc.nextLine();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter student roll_no:");
        roll_no = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter student marks:");
        marks = sc2.nextInt();
        Scanner sc3= new Scanner(System.in);
        System.out.println("Enter student subject:");
        subject = sc3.nextLine();
    }
    public static void main(String[]args)
    {
        Student st1 = new Student();
        st1.set_performance();
        st1.get_performance();
        Student st2 = new Student();
        st2.set_performance();
        st2.get_performance();
        }
}