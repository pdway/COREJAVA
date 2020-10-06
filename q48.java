import java.util.*;
abstract class processor{
	double data;
	void showdata(){
		System.out.println(data);
	}
	
	abstract void process();
}
class factorial extends processor{
	void process(){
		int n=5;
		int fact=0;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		data=fact;
	}
	
}

class circle extends processor{
	void process(){
		double area;
		int r=4;
		area=3.14f * r * r;
		data=area;
	}
	
}


class q48{
	public static void main(String args[]){
		
	processor p= new factorial();
	processor c= new circle();
	p.process();
	c.process();
	p.showdata();
	c.showdata();
		
	}
}