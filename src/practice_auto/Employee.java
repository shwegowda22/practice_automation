package practice_auto;

public class Employee {
	
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
		
	}

	public static void main(String[] args) {
		Employee emp1= new Employee();
		emp1.eid= 101;
		emp1.ename="Shwetha";
		emp1.sal=555656.00;
		emp1.deptno = 78;
				emp1.job = "Test Engineer";
				emp1.display();
				
				Employee emp2 = new Employee();
				emp2.eid= 343;
				emp2.ename="Harish";
				emp2.sal=34434.00;
				emp2.deptno = 10;
						emp2.job = "Test Engineer Manager";
						emp2.display();
	
	}

}
