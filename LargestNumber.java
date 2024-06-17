import java.util.scanner;
public class LargestNumber
{
public static void main(string[] args)
{
int n,largest;
Scanner sc = new Scanner(system.in);
system.out.print("Enter the size of the array:");
n=sc.nextInt();
int arr[]=new int[n];
system.out.println("Enter elements of array:");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
largest=arr[0];
for(int i=0;i<n;i++)
{
if(largest<arr[i])
{
largest=arr[i];
}
}
system.out.[rintln("The largest of the given"+n+"natural numbers is:"+largest);
}
}