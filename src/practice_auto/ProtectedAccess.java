package practice_auto;

//accessing protected variables and method using extends method

/*public class ProtectedAccess extends protectedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedAccess pa = new ProtectedAccess();
		pa.data=67;
		pa.m1();
	}

}*/

//accessing public variables and method 
public class ProtectedAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		publicDemo pa = new publicDemo();
		pa.y=100;
		pa.method2();

}
}