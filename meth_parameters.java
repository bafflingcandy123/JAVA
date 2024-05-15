package java_exam;

class methPara {
 public void hello(String name) {
  System.out.println("hello "+name);
 }
}
public class meth_parameters {
 public static void main(String[] args) {
  methPara x = new methPara();
  x.hello("xyz");
 }
}
