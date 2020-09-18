import java.util.Scanner;
public class arr10ele {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
	
	int arr[]=new int[10];
	int sum=0;
	for(int i=0; i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
		sum+=arr[i];
	}
	float avg= (float)sum/arr.length;
	System.out.println("sum= "+sum);
	System.out.println("avg= "+avg);
    }
}