import java.util.Scanner;
public class dayconvert {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int days;
		int year=0;
		int month=0;
		int day=0;
		
		 System.out.println("enter no.s of days:");
		 days=sc.nextInt();
		 
		 	year=days/365;
			int month1=days%365;
			month=month1/30;
			day= month1%30;
			
        System.out.println("day conversion  is "+year+" yr  "+month+" mm  "+day+" days  "); 
		  
    }
}