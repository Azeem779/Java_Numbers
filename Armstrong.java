import java.util.Scanner;
public class Armstrong {
	public static void main(String args[])
	{
		int n,sum=0,r,temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Number is Armstrong.");
		}
		else
		{
			System.out.println("Number is not Armstrong.");
		}
	}
}
