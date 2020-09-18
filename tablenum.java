import java.util.Scanner;
public class tablenum {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
	System.out.println(" enter the NO.= ");
	int num1 = sc.nextInt();
	System.out.println(" Table of enter NO.");
	for(int i=1;i<=10;i++)
	{
		int table=num1*i;
		System.out.println(table);
	}
	
    }
}