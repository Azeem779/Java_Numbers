import java.util.Scanner;
public class Lcm {
	public static void main(String args[])
	{
		int num1,num2,max,a=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number : ");
		num1=sc.nextInt();
		System.out.print("Enter the second number : ");
		num2=sc.nextInt();
		max=(num1>num2)?num1:num2;
		while(a!=0)
		{
			if(max%num1==0 && max%num2==0)
			{
				System.out.print("LCM of the number is : "+max);
				break;
			}
			max++;
		}
	}
}
