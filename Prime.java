import java.util.Scanner;
public class Prime {
	public static void main(String args[])
	{
		int num,i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		num=sc.nextInt();
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0 && num!=1)
		{
			System.out.print("Number is Prime.");
		}
		else
		{
			System.out.print("Number is not Prime.");
		}
	}
}
