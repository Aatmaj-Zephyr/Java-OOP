/******************************************************************************
find sum 1+1/2+1/3+...1/n

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    double temp = 0;
	    int n=5;
		for(double i=1;i<=n;i++){
		    temp=temp + 1/i;
		}
		System.out.println(temp);
	}
}
