package java_exam;

public class Multi_catch_blk {
 public static void main(String[] args) {
  try {
   int a[] = new int[5];
   a[5] = 30/0 ;
  } catch (ArithmeticException e) {
   System.out.println("Arithematic Exception e");
  } catch (ArrayIndexOutOfBoundsException e) {
   System.out.println("Array Index Out Of Bounds Exception");
  } catch (Exception e) {
   System.out.println("exception occurs");
  }
  System.out.println("rest of the code");
 }
}
