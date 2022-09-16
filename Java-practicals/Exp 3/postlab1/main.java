/******************************************************************************
Create a jagged array of integers. 
This array should consist of two 2-D arrays.
First 2-D array should contain 3 rows having length of 4,3,and 2 respectively.
Second 2-D array should contain 2 rows with length 3 and 4 respectively.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	int a[][][]=new int [2][][];
	a[0]=new int[3][];
	a[0][0]=new int [4];
	a[0][1]=new int [3];
	a[0][2]=new int [2];
	a[1]=new int[2][];
	a[0][0]=new int [2];
	a[0][1]=new int [4];

	}
}
