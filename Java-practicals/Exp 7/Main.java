/******************************************************************************
Create a user defined exception subclass TimeException with necessary constructors and overridden toString method. 
Write a program which accepts two integers with time in minutes.
and seconds and find the sum.
It throws an object of the TimeException class if the value exceeds 60seconds otherwise it displays the total time. 
On printing, the exception object should display an exception name, appropriate message for exception.
__________________________________
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	int second=110;
	int minutes=40;
	try{
	if(second>60){
	    throw new TimeException();
	}
	System.out.println(second+minutes);
	}
	catch (TimeException ex){
	    System.out.print(ex);
	}
	
	}
}
