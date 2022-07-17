import java.util.Scanner;
class Operator
{
   public static void main(String[ ]args)
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a=sc.nextInt();  
        System.out.println("value of a is:+a");

        System.out.println("Enter of a is:+b");
        int b=sc.nextInt();  
        System.out.println("value of a is:+b");

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
     }
}