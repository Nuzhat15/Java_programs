package hello;

class Employee{
	//instance variable
	int empno;
	double salary;
	String name;
}	


public class EmpMain {
	public static void main(String[] args) {
	Employee e = new Employee();
	e.empno = 101;
	e.name = "nuzhat";
	e.salary = 100000;
	System.out.println(e.empno);
	
	}

}
