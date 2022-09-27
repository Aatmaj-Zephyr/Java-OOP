/******************************************************************************
Make vector of student objects
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Student s1 = new Student(2,"Suleman Wirewala");
		Student s2 = new Student(3,"Shambhu");
		Student s3 = new Student(22,"Pratik");
	Vector my = new Vector(3);
	my.add(s1);
	my.add(s2);
	my.add(s3);
	System.out.print(my);	
	}
}
