package p;



public class q55 {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer();
		char ch=' ';
		String str="welcome to cdac family";
		for(int i=0;i<str.length();i++) {
			if(ch==' ' && str.charAt(i)!=' ') 
				s.append(Character.toUpperCase(str.charAt(i)));
		   else
		        s.append(str.charAt(i)); 
				ch=str.charAt(i);
			
		}
		
		System.out.print(s);

	}

}