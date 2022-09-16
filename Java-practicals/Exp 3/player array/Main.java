/******************************************************************************
Write a program which stores information about n players in a two dimensional array. The array should contain the number of rows equal to the number of players. Each row will have a number of columns equal to the number of matches played by that player which may vary from player to player. The program should display player number (index +1), runs scored in all matches and its batting average as output. (It is expected to assign columns to each row dynamically after getting value from the user).
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of players. ");
		int n=sc.nextInt();
		int array[][] = new int[n][];
		for (int i=0;i<n;i++){
		    System.out.println("Enter number of matches played by player "+(i+1));
		    int temp =sc.nextInt();
		array[i]=new int[temp];
			for (int j=0;j<temp;j++){
			     System.out.println("Enter number of runs scored by played by player "+(i+1)+" in match "+(j+1));
			     array[i][j]=sc.nextInt();
		}
		}
	for ( int i=0;i<n;i++){
	    int sum=0;
	    	for ( int k=0;k<array[i].length;k++){
		     sum=sum+array[i][k];
		}
		System.out.println("Total runs score by player "+(i+1)+" are "+sum);
		System.out.println("Average runs score by player "+(i+1)+" are "+ (((double) sum)/array[i].length));
	}
	}
}
