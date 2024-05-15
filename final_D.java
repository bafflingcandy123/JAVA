package java_exam;

public class final_D {
 public static void main(String[] args) {
  final_D x = new final_D();
  x = null;
  System.gc();
  System.out.println("test");
 }

 protected void finalize() {
  System.out.println("called");
 }
}
