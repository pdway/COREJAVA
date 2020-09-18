import java.util.Scanner;
public class tempconver {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float tempf;
		float tempc;
		System.out.println("enter Temperature in Farenhit:");
		 tempf=sc.nextFloat();
		 
		 tempc=(float)(5*(tempf-32)/9);
		 System.out.println("Temperature in Celcious: "+tempc+"C");
	  
    }
}