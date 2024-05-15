package java_exam;

public class paraCon {
 String name;
 int age;

 public paraCon(String name, int age) {
  this.name = name;
  this.age = age;
 }

 public void displayInfo() {
  System.out.println("Name: " + name);
  System.out.println("Age: " + age);
 }

 public static void main(String[] args) {
  paraCon student1 = new paraCon("Alice", 20);
  paraCon student2 = new paraCon("Bob", 25);
  student1.displayInfo();
  student2.displayInfo();
 }
}
