package java_exam;
import java.util.Scanner;

public class switchstate {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Input year:");
  int year = in.nextInt();
  switch (year) {
   case 1:
    System.out.println("1");
    break;
   case 2:
    System.out.println("2");
    break;
   case 3:
    System.out.println("3");
    break;
   default:
    System.out.println("invaild");
    break;
  }
 }
}
