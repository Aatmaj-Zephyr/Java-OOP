/******************************************************************************
Take input from user an display in arraylist
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter length of arraylist");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        ArrayList<Integer> my=new ArrayList<Integer>();
        for(int i=0;i<length;i++){
            System.out.println("Please enter value");
            my.add(sc.nextInt());
        }
        System.out.print(my);
	}
}
