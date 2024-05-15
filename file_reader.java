package java_exam;

import java.io.*;

public class file_reader {
 public static void main(String[] args) throws IOException {
  int i = 0;
  FileReader fr = new FileReader("javafile.txt");
  while ((i=fr.read())!=-1) 
   System.out.println((char) i);
  fr.close();
 }
}
