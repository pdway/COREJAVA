import java.util.Scanner;
public class arrsearchele {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
	
	int arr[]=new int[5];
	int flag=0;
	for(int i=0; i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	System.out.println("enter the NO.= ");
	int num = sc.nextInt();
	for(int i=0; i<arr.length;i++)
	{
		if(arr[i]==num)
		{
			flag=1;
		}
		
		
	}
	if(flag==1)
		{
			System.out.println("enter the NO.is present in array ");
		}
		else
		{
			System.out.println("enter the NO.is not present in array");
		}
	
    }
}