package p;

import java.util.Scanner;

public class q57 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str2[]= {"1","2","3","4","5","6"};
		int a=sc.nextInt();
		for(int i=0;i<str2.length;i++) {
			if(i==(a-1)) {
				System.out.print(str2[i]);
				break;
			}
		}

	}

}