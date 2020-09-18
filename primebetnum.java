import java.util.Scanner;
public class primebetnum {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
	System.out.println("enter the NO.= ");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int flag;
	while(num1 <= num2 )
	{
		flag=0;
		for(int i=2;i<=num1/2;i++)
		{
			if(num1%i==0)
		{
			flag=1;;
		}
		}
		if(flag==0)
		{
			System.out.print(num1 +" ");
		}
		num1++;
	}
	
    }
}