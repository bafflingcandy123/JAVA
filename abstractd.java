package java_exam;

abstract class testt {
 abstract void callme();
}

class mn extends testt {
 void callme() {
  System.out.println("child callme");
 }
}
public class abstractd{
 public static void main(String[] args) {
  mn x = new mn();
  x.callme();
 }
}
