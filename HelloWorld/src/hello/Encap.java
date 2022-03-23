package hello;

class Student{
	private int rollno;
	private String name;
	private String colzname;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColzname() {
		return colzname;
	}
	public void setColzname(String colzname) {
		this.colzname = colzname;
	}
	
}
public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setRollno(101);
		System.out.println(s.getRollno());
	}

}
