package java_exam;

interface Drawable {
 void draw();
}

class Circle implements Drawable {
 public void draw() {
  System.out.println("Drawing a circle");
 }
}

class Square implements Drawable {
 public void draw() {
  System.out.println("Drawing a square");
 }
}

public class Inerface_demo {
 public static void main(String[] args) {
  Drawable circle = new Circle();
  Drawable square = new Square();

  drawShape(circle);
  drawShape(square);
 }

 public static void drawShape(Drawable obj) {
  obj.draw();
 }
}
