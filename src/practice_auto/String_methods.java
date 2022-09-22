package practice_auto;

public class String_methods {

	public static void main(String[] args) {
	String s= "Welcome";
	String s1=" to Java";
	
	System.out.println("The length of string is :" + s.length());
	
	System.out.println("The concatenated string is :"+ s.concat(s1));
	
	s="     New Word        ";
	System.out.println("Text before trim is:"+ s);
	System.out.println("Text after trim is:"+ s.trim());
	
s="Test";
System.out.println("Third character is :"+ s.charAt(3));

s="Talview";
System.out.println("Talview word contains view:" + s.contains("view"));

s="Recruit";
s1= "Recruit";
String s2= "Candidate";
System.out.println("The s1 and s2 is equal:" + s.equals(s1));
System.out.println("The s1 and s2 is equal:" + s.equals(s2));

String s3="candidate";
System.out.println("The s1 and s2 is equal:" + s2.equalsIgnoreCase(s3));

s3="Learning Java";
System.out.println("Replacing the sentence: " + s3.replace("Java","selenium"));
System.out.println("Replacing the character: " + s3.replace("J","D"));

System.out.println("Substring: " + s3.substring(0,6));
System.out.println("Uppercase: " + s3.toUpperCase());
s3= "HELLO";
System.out.println("Uppercase: " + s3.toLowerCase());


	}

}
