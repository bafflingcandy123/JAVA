package java_exam;

class qwerty {
 public int y;
 qwerty(int y) {
  this.y = y;
 }
}
public class create_array_obj {
 public static void main(String[] args) {
  qwerty[] z;
  z = new qwerty[5];
  z[0] = new qwerty(87);
  z[1] = new qwerty(81);
  z[2] = new qwerty(83);
  z[3] = new qwerty(82);
  z[4] = new qwerty(90);
  for (int i = 0; i < z.length; i++) {
   System.out.println("element at "+i+" : "+ z[i].y);
  }
 }
}
