/******************************************************************************
Find largest of three numbers using if else.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	int a=2;
	int b=3;
	int c=5;
	System.out.println("The largest number is ");
	if (a>b){
	    if(c>a){
	        System.out.print(c);
	    }
	    else{
	         System.out.print(a);
	    }
	}
	else{
	     if(c>b){
	        System.out.print(c);
	    }
	    else{
	         System.out.print(b);
	    }
	}
	}
}
