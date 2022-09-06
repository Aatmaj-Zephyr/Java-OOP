/******************************************************************************
 *
 * Make class vector with methods to add and take product.
 *******************************************************************************/
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try {
      Scanner my_Scanner = new Scanner(System.in);

      vector A =
          new vector(my_Scanner.nextDouble(), my_Scanner.nextDouble(), my_Scanner.nextDouble());
      vector B =
          new vector(my_Scanner.nextDouble(), my_Scanner.nextDouble(), my_Scanner.nextDouble());
      vector C = vector.sum(A, B);
      C.print();
      double c = vector.dot_product(A, B);
      System.out.println(c);
      C = vector.cross_product(A, B);
      C.print();

      C = new vector();

    } catch (EmptyVectorException ex) {

      System.out.println(ex.getMessage()); // print error message
    }
  }
}
