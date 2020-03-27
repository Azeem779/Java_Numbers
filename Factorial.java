import java.util.Scanner;
public class Factorial {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num,fact=1;
		System.out.print("Enter the number: ");
		num=sc.nextInt();
		if(num==0 || num==1)
		{
			System.out.print("Factorial of the number is : "+fact);
		}
		for(int i=1;i<=num;i++){
				fact=fact*i;
			}
			System.out.print("Factorial of the number is : "+fact);
	}
}
