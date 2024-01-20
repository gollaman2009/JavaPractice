import java.util.*;
class sumofdigits 
{
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    int a,sum=0,i;
    System.out.println("enter any number");
    a=sc.nextInt();
    i=a;
    while (i>0)
    {
        sum=sum+(i%10);
        i/=10;
    }
    System.out.println(sum);
   }
}