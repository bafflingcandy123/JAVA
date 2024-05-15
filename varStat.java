package java_exam;

class staticD {
 static int a = 20;
 static int b = 90;

 static void test() {
  System.err.println("a="+a);
 }
}
public class varStat {
 public static void main(String[] args) {
  staticD.test();
  System.out.println("b="+staticD.b);
 }
}
