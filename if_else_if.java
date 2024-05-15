package java_exam;

class value {
 int a;
 int b;

 public void compare(int a, int b){
  if (a > b) {
   System.out.println("a is greater than b");
  }
  else if (a == b) {
   System.out.println("a and b are equal");
  }
  else {
   System.out.println("b is greater than a");
  }
 }
}

public class if_else_if {
 public static void main(String[] args) {
  value x = new value();
  x.compare(2, 2);
 }
}
