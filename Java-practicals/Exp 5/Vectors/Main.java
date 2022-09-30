/******************************************************************************
AIM: Create a class Employee which stores E-Name, E-Id and E-Salary of an Employee. Use class Vector to maintain an array of Employee with respect to the E-Salary. Provide the following functions

1) Create (): this function will accept the n Employee records in any order and will arrange them in the sorted order.

2) Insert (): to insert the given Employee record at appropriate index in the vector depending upon the E-Salary.

3) delete ByE-name( ): to accept the name of the Employee and delete the record having given name

4) deleteByE-Id ( ): to accept the Id of the Employee and delete the record having given E-Id.

Provide the following functions

1. boolean add(E e) : This method appends the specified element to the end of this Vector.

2. void addElement(E obj) This method adds the specified component to the end of this vector, increasing its size by one.

3. int lastIndexOf(Object o, int index) This method returns the index of the last occurrence of the specified element in this vector, searching backwards from index, or returns -1 if the element is not found.

4. void removeElementAt(int index)This method deletes the component at the specified index.
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	Employee a = new Employee("Suleman",1,20);
	Employee b = new Employee("Shambho",2,11);
	Employee c = new Employee("Pratik",13,33);
	EmployeeVector vect = new EmployeeVector();
	vect.create(a,b,c);
	vect.display();
	System.out.println();
	vect.delete(2);
	vect.display();
	
	}
}
