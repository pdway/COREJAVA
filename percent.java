import java.util.Scanner;
public class percent {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s1,s2,s3,s4,s5;
		float percent1;
		System.out.println("enter marks of subject1:");
		 s1=sc.nextInt();
		 System.out.println("enter marks of subject2:");
		 s2=sc.nextInt();
		 System.out.println("enter marks of subject3:");
		 s3=sc.nextInt();
		 System.out.println("enter marks of subject4:");
		 s4=sc.nextInt();
		 System.out.println("enter marks of subject5:");
		 s5=sc.nextInt();
        percent1=(float)((s1+s2+s3+s4+s5)/5);		
        System.out.println("Percentage secure by student is "+percent1+"%"); 
		  
    }
}