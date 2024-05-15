package java_exam;

interface Printable {
 void printMessage();
}

class a implements Printable {
 public void printMessage() {
  System.out.println("in class A");
 }
}

class b extends a implements Printable {
 public void printMessage() {
  super.printMessage(); 
  System.out.println("in class B");
 }
}

public class OCP {
 public static void main(String[] args) {
  Printable x;
  x = new b();
  x.printMessage();
 }
}
