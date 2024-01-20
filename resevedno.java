import java.util.Scanner;
public class resevedno 
{ 
   public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);
        int a,i,rev=0;
        System.out.println("enter any number");
        a=sc.nextInt();
        i=a;
        while (i>0)
        {
            rev=rev*10 +(i%10);
            i/=10;
        }
        System.out.println(rev);
    }
        
}    