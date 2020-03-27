import java.util.Scanner;
public class Perfect {
	public static void main(String args[])
	{
		int i,num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		num=sc.nextInt();
		for(i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.print("Number is perfect.");
		}
		else
		{
			System.out.print("Number is not Perfect.");
			
		}
	}
}
