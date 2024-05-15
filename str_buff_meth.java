package java_exam;

public class str_buff_meth {
 public static void main(String[] args) {
  StringBuffer str = new StringBuffer("obj lng");
  System.out.println(str);
  System.out.println(str.length());
  System.out.println(str.capacity());
  int pos = str.indexOf("lng");
  str.insert(pos, "ori");
  System.out.println(str);
  str.setCharAt(6, '-');
  System.out.println(str);
  str.append("xyz");
  System.out.println(str);
  System.out.println(str.length());
 }
}
