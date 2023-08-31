public class Num 
{
    public static void main(String[] args) {
        int Num  = 12345, reversed = 0;
        System.out.println("Original Number: " + Num);
        while(Num != 0) {
            int digit = Num % 10;
            reversed = reversed * 10 + digit;
            Num /= 10;
          }
          System.out.println("Reversed Number: " + reversed);
        }
      }
