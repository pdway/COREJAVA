class Student{
    private int rollNo;
    private String name;
   
    Student(){
        this(171,"xyz");
    }

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    void show(){
        System.out.println(" RollNo : "+rollNo+"  Name : "+name);
    }
}

class q41{
    public static void main(String args[]){
        Student s = new Student();
        s.show();

        Student s1 = new Student(323,"asd");
        s1.show();
    }
}