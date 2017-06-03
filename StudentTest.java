/* Author: James Bowens
*  Date: September 13, 2016
*  Purpose: Test to call Student class
*/

public class StudentTest {
	public static void main(String[] args) {
		
		// Creates new Student object
		Student s = new Student(1000,"Tim","Smith");
		System.out.println(s.getStudentId() +", " + s.getFirstName()+" " +s.getLastName());
		s.setStudentId(5200);
		s.setFirstName("Pamela");
		s.setLastName("Johnson");
		System.out.println(s.getStudentId() +", " + s.getFirstName()+" " +s.getLastName());
		s.setStudentId(118940);
		s.setFirstName("Ashley");
		s.setLastName("Maynor");
		System.out.println(s.getStudentId() +", " + s.getFirstName()+" " +s.getLastName());
	}   
}