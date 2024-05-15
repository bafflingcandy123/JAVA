package java_exam;

public class EnumD {
 public enum Day { 
   SUN, MON, TUE, WED, THU, FRI, SAT
 }

 public static void main(String[] args) {
  for (Day d : Day.values()) {
   Weekend(d); 
  }
 }

 public static void Weekend(Day d) { 
  if (d == Day.SUN) {
   System.out.println("Holiday"); 
  } 
  else {
   System.out.println("Working"); 
  }
 }
}
