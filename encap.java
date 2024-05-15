package java_exam;

class getdata {
 private String name;
 private int ID;

 public String getname(){
  return name;
 }
 
 public int getID() {
  return ID;
 }

 public void setname(String name) {
  this.name = name;
 }
 
 public void setID(int ID) {
  this.ID=ID;
 }
}
public class encap {
 public static void main(String[] args) {
  getdata x = new getdata();
  x.setname("xyz");
  x.setID(15);
  System.out.println("ID:"+x.getID()+"\nName:"+x.getname());
 }
}
