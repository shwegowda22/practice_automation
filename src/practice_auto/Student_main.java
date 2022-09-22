package practice_auto;

public class Student_main {

	public static void main(String[] args) {
		
		//assigning values using reference variables
		/*Student stu1= new Student();
		stu1.sid= 101;
		stu1.sname="Shwetha";
		stu1.grade='A';
				stu1.display();*/
				
				//by using method
				//stu1.getValues(12, "hello", 'C');
				//stu1.display();

				//constructor method
				Student stu1= new Student(12,"name",'D');
				stu1.display();
	}

}
