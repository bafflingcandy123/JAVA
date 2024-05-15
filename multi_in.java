package java_exam;

class ac {
 public void aa() {
  System.out.println("inside a");
 }
}

class bc extends ac{
 public void bb() {
  System.out.println("inside b");
 }
}

class ca extends bc{
 public void cc() {
  System.out.println("inside c");
 }
}
public class multi_in {
 public static void main(String[] args) {
  ca x = new ca();
  x.cc();
  x.bb();
  x.aa();
 }
}
