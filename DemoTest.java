import java.util.*;
class DemoTest
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int a,b,c,d,e,f;
System.out.println("Enter the value of a");
a=sc.nextInt(); 
System.out.println("Enter the value of b");
b=sc.nextInt(); 
c=a+b;
System.out.println("Addition is:"+c);
d=a-b;
System.out.println("Subtraction is:"+d);
e=a*b;
System.out.println("Multiplication is:"+e);
try
{
f=a/b;
System.out.println("Division is:"+f);
}
catch(Exception f1)
{
System.out.println("you cannot divide by zero");
}
}
}
