package java_exam;

class ConDef {
 int a, b;

 ConDef() {
  a = 20;
  b = 30;
 }
 double add(){
  return a+b;
 }
}
public class defCon {
 public static void main(String[] args) {
  ConDef x = new ConDef();
  double sum = x.add();
  System.out.println(sum);
 }
}
