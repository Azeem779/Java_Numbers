import java.util.Scanner;
public class LastDigit {
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		num=sc.nextInt();
		int last=num%10;
		System.out.print("Last digit of the number is: "+last);
	}
}
