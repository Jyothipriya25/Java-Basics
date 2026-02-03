import java.util.Scanner;

public class PassFail {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the marks: ");
    int marks=in.nextInt();
    if(marks >= 40) {
      System.out.println("Pass");
    }
    else
    {
      System.out.println("Fail");
    }
    sc.close();
  }
}
