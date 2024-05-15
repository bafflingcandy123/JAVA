package java_exam;

public class own_exception {
 static void validate(int age) {
  if (age < 18)
   throw new ArithmeticException("not vaild");
  else
   System.out.println("welcome");
 }
 public static void main(String[] args) {
  validate(20);
  System.out.println("rest of the code");
 }
}
