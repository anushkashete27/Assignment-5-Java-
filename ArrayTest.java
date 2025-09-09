class ArrayTest
{
public static void main(String args[])
{
int arr[]={1,2,3,4,5};
try
{
System.out.println(arr[5]);
}
catch(Exception e)
{
System.out.println("you can display the 6th element because the size of array is 5 ");
}
System.out.println(arr[2]);
}
}