class person{
	person(){
		System.out.println("0 para person");
	}
	
	person(int i){
		System.out.println("1 para person");
	}
	
}

class employee extends person{
	employee(){
		System.out.println("0 para employee");
	}
	
	employee(int i){
		System.out.println("1 para employee");
	}
	
}

class q47{
		public static void main(String args[]){
			
			employee e=new employee();
			employee e=new employee(1);
		}
}