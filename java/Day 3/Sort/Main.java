/******************************************************************************
Sort the array
*******************************************************************************/
import java.util.* ;
public class Main
{
	public static void main(String[] args) {
		int a[]= new int[5];
		Scanner sc = new Scanner(System.in);
		
			for (int i=0;i<a.length;i++){
		    a[i]=sc.nextInt();
		}
		for (int i=0;i<a.length;i++){
		    	for (int j=i-1;j>=0;j--){
		    	    if(a[j]<a[j+1]){
		    	        int temp=a[j];
		    	        a[j]=a[j+1];
		    	        a[j+1]=temp;
		    	    }
		   
		}
		}
		for (int i=0;i<a.length;i++){
		    System.out.println(a[i]);
		}
		
	}
}
