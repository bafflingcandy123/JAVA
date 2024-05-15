package java_exam;

class demo {
 public void B() {
  for (int y = 1; y <= 10; y++) {
   if (y == 4) {
    break;
   }
   System.out.println(y);
  }
 }

 public void C() {
  for (int z = 1; z <= 10; z++) {
   if (z == 4) {
    continue;
   }
   System.out.println(z);
  }
 }
}
public class B_C {
 public static void main(String[] args) {
  demo x = new demo();
  x.B();
  x.C();
 }
}
