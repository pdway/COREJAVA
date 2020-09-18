import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of circle:");
		int r;
		float pi=3.14F;
        r=sc.nextInt();
		float area;
		float circum;
		circum=(float)(2*r*pi);	
        area=(float)(r*r*pi);		
        System.out.println("Area of circle:"+area); 
		 System.out.println("Area of circle:"+circum); 
    }
}