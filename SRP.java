package java_exam;

class GetID {
 private int ID;

 public int getID() {
  return ID;
 }

 public void setID(int ID) {
  this.ID = ID;
 }
}

class getName {
 private String name;

 public String getname() {
  return name;
 }

 public void setname(String name) {
  this.name = name;
 }
}

public class SRP {
 public static void main(String[] args) {
  getName x = new getName();
  GetID y = new GetID();
  x.setname("xyz");
  y.setID(15);
  System.out.println("ID:" + y.getID() + "\nName:" + x.getname());
 }
}
