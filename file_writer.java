package java_exam;
import java.io.*;
public class file_writer {
 public static void main(String[] args) throws IOException{
  FileWriter fw = new FileWriter("javafile.txt");
  String s = "java lab";
  char ch[] = s.toCharArray();
  for (int i = 0; i < ch.length; i++) 
   fw.write(ch[i]);
  fw.close();
  System.out.println("success");  
 }
}
