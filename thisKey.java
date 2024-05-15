package java_exam;

class KeyThis {
 String name;
 int age;
 public void setName(String name) {
  this.name = name;
 }

 public void setAge(int age) {
  this.age = age;
 }
 
 public void getName(){
  System.out.println("name :"+this.name);
 }
 
 public void getAge(){
  System.out.println("Age :"+this.age);
 }
}
public class thisKey {
 public static void main(String[] args) {
  KeyThis x = new KeyThis();
  x.setName("xyz");
  x.setAge(12);
  x.getName();
  x.getAge();
 }
}
