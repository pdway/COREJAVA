class Student{
	
	private int rno;
	private String name;
void setData(int rno, String name){
	
	this.rno=rno;
	this.name=name;
}

void showData(){
	System.out.println(rno+" "+name);
}

}


class studentClass{
	public static void main(String args[]){
		Student e= new Student();
		e.setData(10,"ram");
		e.showData();
	}
}