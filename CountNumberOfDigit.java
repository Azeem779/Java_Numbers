import java.util.Scanner;
public class CountNumberOfDigit {
	public static void main(String args[])
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=sc.nextInt();
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("Number of digit in the Number: "+count);
	}
}
