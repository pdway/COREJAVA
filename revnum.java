import java.util.Scanner;
public class revnum {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
	System.out.println("enter the NO.= ");
	int num = sc.nextInt();
	int rev=0;
	int add=0;
	int sum=0;
	while(num!=0)
	{
		rev=num%10;
	    sum=rev + sum*10;
		num=num/10;
	}
	System.out.println("Revers NO. is = "+sum);
    }
}