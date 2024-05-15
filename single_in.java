package java_exam;

class a {

 public void aa() {
  System.out.println("in class a");
 }
}

class b extends a {

 public void bb() {
  System.out.println("in class b");
 }
}
public class single_in{
 public static void main(String[] args) {
  b x = new b(); 
  x.aa(); 
  x.bb(); 
 }
}
