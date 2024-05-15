package java_exam;

public class string_meth {
 public static void main(String[] args) {
  String x = new String("xyz");
  String y = "abc";
  String z = " ";
  System.out.println(x);
  System.out.println(y);
  System.out.println(y.charAt(2));
  System.out.println(x.length());
  System.out.println(x.substring(2));
  System.out.println(x.substring(1, 2));
  System.out.println(x.equals(y));
  System.out.println(z.isEmpty());
  System.out.println(x.replace("x", "a"));
  System.out.println(x.toLowerCase());
  System.out.println(x.toUpperCase());
  System.out.println(x.equalsIgnoreCase(z));
 }
}
