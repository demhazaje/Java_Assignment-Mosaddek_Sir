 import java.util.*;
public class LinearEquation {


  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the value of a=");
    int a = scan.nextInt();
    System.out.print("Enter the value of b=");
    int b = scan.nextInt();
    System.out.print("Enter the value of c=");
    int c = scan.nextInt();
    System.out.print("Enter the value of d=");
    int d = scan.nextInt();
    System.out.print("Enter the value of m=");
    int m = scan.nextInt();
    System.out.print("Enter the value of n=");
    int n = scan.nextInt();
    if (a * d == c * b) {
      System.out.println("denominator  is Zero cant calculate");
    } else {
      double x1 = (m * d - b * n) / (a * d - c * b);
      double x2 = (n * a - m * c) / (a * d - c * b);
      System.out.println("Value of x1="+x1);
      System.out.println("Value of x2="+x2);
    }

  }

}
