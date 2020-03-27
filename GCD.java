import java.util.Scanner;
public class GCD {
	public static void main(String args[])
	{
		int i,num1,num2,gcd=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		num1=sc.nextInt();
		System.out.print("Enter the second number: ");
		num2=sc.nextInt();
		for(i=1;i<=num1 && i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
			}
		}
		System.out.print("Gcd of the number is : "+gcd);
	}
}
