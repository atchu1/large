import java.util.Scanner;
 class Large
{
  public static void main(String args[])
  {
    int x, y, z;
    System.out.println("Enter three integers");
    Scanner in = new Scanner(System.in);
  x = in.nextInt();
  y = in.nextInt()
  z = in.nextInt();
  if (x > y && x > z)
      System.out.println("The largest number is",x);
   else if (y > x && y > z)
      System.out.println("The largest number is.",y);
   else 
      System.out.println("The largest number is",z);
 
  }
}

