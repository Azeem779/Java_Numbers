import java.util.Scanner;
public class ProductOfDigit {
	public static void main(String args[])
	{
		int num,pro=1,rem;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		num=sc.nextInt();
		while(num>0)
		{
			rem=num%10;
			pro=pro*rem;
			num=num/10;
		}
		System.out.print("Product of the digit of the number is : "+pro);
	}
}
