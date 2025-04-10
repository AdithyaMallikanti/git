 import java.util.*;
 public class palindrome
{
    public static void main(String args[])
    {
        int sum=0,r,n;
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the  a number to check whether it is palindrome or not");
        n=sc.nextInt();
        int temp=n;
        while(n>0)
    {
        r=n%10;
        sum=sum*10+r;
        n=n/10;

    }
    System.out.println(sum + "is the number you entered and it is a palindrome");
    if(sum==temp)
    {
        System.out.println("it is palidrome");
    }
    else
    {
        System.out.println("it is not a palindrome");
    }

    }
}