class Student{
	
	private int rno;
	private String name;
	private static int count;
void setData(int rno1, String name1,int count1){
	
	rno=rno1;
	name=name1;
	count=count1;
}

void showData(){
	System.out.println(rno+" "+name);
}

}


class studentCount{
	public static void main(String args[]){
		Student e= new Student();
		e.setData(21,"ram",1);
		e.showData();
		
		Student e1= new Student();
		e1.setData(22,"shyam",2);
		e1.showData();
	}
}