package java_exam;

class asd {
 public void draw() {
  System.out.println("Drawing a shape");
 }
}

class lkj extends asd {
 public void drawCircle() {
  System.out.println("Drawing a circle");
 }
}

class zxc extends asd {
 public void drawTriangle() {
  System.out.println("Drawing a triangle");
 }
}

public class hi_in {
 public static void main(String[] args) {
  lkj circle = new lkj();
  zxc triangle = new zxc();

  circle.draw();
  circle.drawCircle();

  triangle.draw();
  triangle.drawTriangle();
 }
}
