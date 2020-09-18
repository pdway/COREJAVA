import java.util.*;
public class arrdesc {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
	//System.out.println("enter the NO.= ");
	//int num = sc.nextInt();
	int arr[]=new int[10];
	int sum=0;
	for(int i=0; i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	Arrays.sort(arr);
	
	for(int i=arr.length-1; i>=0;i--)
	{
		System.out.print(arr[i]+ " ");
		
	}
	
    }
}