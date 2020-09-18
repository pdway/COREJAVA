import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float p;
		float r;
		float R;
		float t;
		float si;
		System.out.println("enter principle amount:");
		 p=sc.nextInt();
		 System.out.println("enter interest rate:");
		 R=sc.nextFloat();
		 System.out.println("enter time dureation in year:");
		 t=sc.nextFloat();
		 
		 r=(float)((float)R/100);
        si=(float)(p*(1+(r*t)));		
        System.out.println("Percentage secure by student is "+si); 
		  
    }
}