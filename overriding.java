package java_exam;

class Shape {
 public void draw() {
  System.out.println("Drawing");
 }
}

class Circle extends Shape {
 public void draw() {
  System.out.println("Drawing a circle");
 }
}

public class overriding {
 public static void main(String[] args) {
  Shape z = new Circle();
  z.draw();
  Shape y = new Shape();
  y.draw();
 }
}
