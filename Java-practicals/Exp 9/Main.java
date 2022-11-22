/******************************************************************************
Create a Package Engineering which has two classes as Student and Marks. Accept (n) student detail like roll_no, Subject_name, Student_name,caluculate total marks in the class Student Write display () method to display details and sort () method to sort the students records as per increasing order of the total marks. The function sort must be statically defined to invoke it without referring any object. Both the functions write in the Marks class.

*******************************************************************************/
import Engineering.Student;
import Engineering.Marks;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	Student A= new Student();
	A.marks=20;
	A.display();
	Student B= new Student();
	B.marks=210;
	Student C= new Student();
	C.marks=10;
	Student listofstudents[]=new Student[3];
	listofstudents[0]=A;
	listofstudents[1]=B;
	listofstudents[2]=C;
	System.out.println("Before Sorting");
	System.out.println(listofstudents[0].marks);
	System.out.println(listofstudents[1].marks);
	System.out.println(listofstudents[2].marks);
	Marks.sort(listofstudents);
	System.out.println("After Sorting");
	System.out.println(listofstudents[0].marks);
	System.out.println(listofstudents[1].marks);
	System.out.println(listofstudents[2].marks);
	
	}
}
