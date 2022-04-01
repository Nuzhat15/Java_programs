package hello;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//1. Instance data members to be private
//2.Constructor
//3. Getter

// this class is called as POJO(plain old java object), bean
class date{
	private int empno;
	private String empame;
	private double  salary;
	public date(int empno, String empame, double salary) {
		this.empno = empno;
		this.empame = empame;
		this.salary = salary;
	}
	public int getEmpno() {
		return empno;
	}
	public String getEmpame() {
		return empame;
	}
	public double getSalary() {
		return salary;
	}
	
}

public class Colect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<date> al = new ArrayList<>();
		date d[] = new date[3]; //class name as an array. creating object of a class.
		for(int i=0;i<3;i++) {
		System.out.println("enter empno");
		int empno = sc.nextInt();
		System.out.println("enter empname");
		String empname = sc.next();
		System.out.println("enter salary");
		double salary = sc.nextDouble();
		d[i] = new date(empno, empname,salary);
		al.add(d[i]);
	}
	Iterator i=al.iterator();
	while(i.hasNext()) {
		date dl = (date) i.next();//object -->reference of date
	System.out.println(dl.getEmpno()+" "+dl.getEmpame()+" "+dl.getSalary());
	}
	}

}
