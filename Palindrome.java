import java.util.Scanner;
public class Palindrome {
	public static void main(String args[])
	{
		int temp,num,rem,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.print("Number is Palindrome.");
		}
		else
		{
			System.out.print("Number is not Palindrome.");
		}
	}
}
