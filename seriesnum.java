import java.util.Scanner;
public class seriesnum {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
	System.out.println("enter the NO.= ");
	int n = sc.nextInt();
	int num=2;
	int sum=0;
	for(int i=0;i<n;i++)
	{
		num+=10;
		System.out.print(num+"+");
		sum+=num;
	}
	System.out.println();
	System.out.println("sum is= "+sum);
	
    }
}