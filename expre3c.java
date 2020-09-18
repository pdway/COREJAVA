public class expre3c {
    public static void main(String[] args) {
		int y=2;
		int x=3;
		int z;
		z = (x++)-(--y)-(--x)+(x++);
		System.out.println("x="+x); 
		System.out.println("y="+y); 
        System.out.println("z="+z); 
    }
}