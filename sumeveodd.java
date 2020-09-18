import java.util.Scanner;
public class sumeveodd {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
	//System.out.println("enter the NO.= ");
	//int num = sc.nextInt();
	int arr[]=new int[5];
	int evesum=0;
	int oddsum=0;
	for(int i=0; i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	for(int i=0; i<arr.length;i++)
	{
		
		if(arr[i]%2==0)
		{
			evesum+=arr[i];
		}
		else
		{
			oddsum+=arr[i];
		}
		
	}
	
	System.out.println("even sum is= "+evesum);
	System.out.println("odd sum is= "+oddsum);
	
    }
}