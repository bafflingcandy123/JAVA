package java_exam;

class poiu {
 public void meth() {
  System.out.println("no parameters");
 }

 public void meth(int a) {
  System.out.println(a);
 }

 public void meth(int a, int b) {
  System.out.println(a + b);
 }

 public void meth(int a, int b, int c) {
  System.out.println(a + b + c);
 }
}

public class overload {
 public static void main(String[] args) {
  poiu x = new poiu();
  x.meth();
  x.meth(2);
  x.meth(2, 3);
  x.meth(4, 4, 2);
 }
}
