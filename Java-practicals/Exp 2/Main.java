/******************************************************************************

Make class vector with methods to add and take product.
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
 vector A = new vector(2,3,4);
 vector B = new vector(1,2,4); 
 vector C = vector.sum(A,B);
 C.print();
 double c= vector.dot_product(A,B);
 System.out.println(c);
  C = vector.cross_product(A,B);
 C.print();
	    
	}
}
