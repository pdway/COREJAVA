import java.util.Scanner;
public class swapnum {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
	System.out.println("NO.1= ");
	int num1 = sc.nextInt();
	System.out.println("NO.2= ");
    int num2 = sc.nextInt();
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;

   System.out.println("NO.1 "+num1+" NO.2 "+num2);
    }
}