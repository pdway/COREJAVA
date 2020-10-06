import java.util.*;
interface taxable{
	double salestax=0.07;
	double incometax=0.105;
	
	
	 void caltax();
}
class emp implements taxable{
	int empid;
	int salary;
	String name;
	emp(){}
	
	emp(int empid,int salary,String name){
		
		this.empid=empid;
		this.salary=salary;
		this.name=name;
	}
	public void caltax(){
		double incometax= salary * incometax;
		System.out.println("tot incometax "+incometax);
	}
	
}

class product implements taxable{
	int pid;
	int price;
	int quantity;
	product(){}
	
	product(int pid,int price,int quantity){
		
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	public void caltax(){
		double salestax= (price*quantity) * salestax;
		System.out.println("tot salestax "+salestax);
		
	}
	
}




class q49{
	public static void main(String args[]){
		taxable t = new emp(1,15000,"kedar");
		taxable t1 = new product(1,400,6);
		t.caltax();
		t1.caltax();
		
		
	
		
	}
}