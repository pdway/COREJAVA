import java.util.*;

class faculty{
	private int facultyid;
	private double salary;
	
	faculty(){
		void input(int facultyid){
			this.facultyid=facultyid;
			salary=0;
			
		}
		
		protected double getsal(){
			return salary;
		}
		protected void setsal(double salary){
			this.salary=salary;
		}
		
		void printsalary(){
			System.out.println("the sal of facultyid"+facultyid+"is"+salary);
		}
	}
}

class fulltimefaculty extends faculty{
	private double basicsalary;
	private double allow;
	
	fulltimefaculty(){
		super();
		basicsalary=0;
		allow=0;
	}
	
	void input(int facultyid,double basicsalary,double allow){
		input(facultyid);
		this.basicsalary=basicsalary;
		this.allow=allow;
		setsal(basicsalary+allow);
		
	}
	
}

class parttimefaculty extends faculty{
	private double workinghr;
	private double rateperhr;
	
	fulltimefaculty(){
		super();
		workinghr=0;
		rateperhr=0;
	}
	
	void input(int facultyid,double workinghr,double rateperhr){
		input(facultyid);
		this.workinghr=workinghr;
		this.rateperhr=rateperhr;
		setsal(workinghr+rateperhr);
		
	}
	
}
 
public class q44{
	public static void main(String args[]){
	fulltimefaculty f=new fulltimefaculty;
	parttimefaculty p=new parttimefaculty;
	
	f.input(100,5000,2000);
	p.input(200,10,100);
	p.printsalary();
	f.printsalary();
	}
	
} 
	
	
	
	
