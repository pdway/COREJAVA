import java.util.Scanner;
public class primenum {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
	System.out.println("enter the NO.= ");
	int num = sc.nextInt();
	int count=0;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			count++;
		}
	}
	System.out.println("1 is not prime number");
	if(count==0)
	{
		System.out.println(num+" is prime number");
	}
	else
	{
		System.out.println(num+" is not prime number");
	}
    }
}