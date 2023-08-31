public class Number {
    public static void main(String[] args) {
      
      int num = 656, reversed_Num = 0, remainder;
      int originalNum = num;
      
      while (num != 0) {
        remainder = num % 10;
        reversed_Num = reversed_Num * 10 + remainder;
        num /= 10;
      }
      if (originalNum == reversed_Num) {
        System.out.println(originalNum + " is Palindrome.");
      }
      else {
        System.out.println(originalNum + " is not Palindrome.");
      }
    }
  }