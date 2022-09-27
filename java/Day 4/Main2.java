/******************************************************************************
Take input from user an display in arraylist of strings
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter length of arraylist");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        ArrayList<String> my=new ArrayList<String>();
        for(int i=0;i<length;i++){
            System.out.println("Please enter value");
            my.add(sc.next());
        }
        System.out.print(my);
	}
}
