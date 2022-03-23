package hello;

class Employees{
	int empno;
	double salary;
	String name;

public double increaseSalary(double bonus) {
	double newsalary;
	newsalary = salary+bonus;
	//System.out.println(newsalary);
	return newsalary;
}
}

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees e = new Employees();
		e.salary = 100000;
		//e.increaseSalary(2000);
		System.out.println(e.increaseSalary(2000));
	}

}
