import java.util.Scanner;
public class FirstDigit {
	public static void main(String args[])
	{
		int num,first;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		num=sc.nextInt();
		first=num;
		while(first>=10)
		{
			first=first/10;
		}
		System.out.print("First digit of the number is : "+first);
	}
}
