package java_exam;

class aq {
 public void callme() {
  System.out.println("inside a");
 }
}

class bq extends aq {
 public void callme() {
  System.out.println("inside b");
 }
}

class cq extends aq{
 public void callme() {
  System.out.println("inside c");
 }
}

public class dy_meth_dis {
 public static void main(String[] args) {
  aq x = new aq();
  bq y = new bq();
  cq z = new cq();
  aq r;
  r = x;
  r.callme();
  r = y;
  r.callme();
  r = z;
  r.callme();
 }
}