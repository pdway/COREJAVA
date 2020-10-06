package p;

public class q52 {

	public static void main(String[] args) {
		String arr[]= {"74","9","253","61","74","75","66"};
		double sum=0;
		for(String i:arr) {
			int a=Integer.parseInt(i);
			sum+=a;
		}
		System.out.println("Sum of Integers "+sum);

	}

}