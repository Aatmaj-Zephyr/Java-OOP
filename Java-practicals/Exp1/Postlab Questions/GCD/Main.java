/******************************************************************************
GCD of two numbers. case 0 not considered.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int a=13;
	    int b = 6;
	    int c = GCD(a,b);
		System.out.println(c);
	}

public static int GCD(int a, int b){
     if (a == b){
   return a;
     }
    if(a>b){
        return GCD(a-b, b);
    }
    return GCD(a, b-a);
}
}
