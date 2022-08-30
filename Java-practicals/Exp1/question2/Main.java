/******************************************************************************
 *
 * make class complex for addition subtraction multiplication and division of two complex numbers.
 *******************************************************************************/
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    complex a = new complex(1, -2);
    complex b = new complex(2, 2);
    complex c = add(a, b);
    complex.print(c);
    c = subtraction(a, b);
    complex.print(c);
    c = multiplication(a, b);
    complex.print(c);
    c = inverse(c);
    complex.print(c);
    c = division(a, b);
    complex.print(c);
  }

  public static complex add(complex a, complex b) {
    return new complex(a.real + b.real, a.img + b.img);
  }

  public static complex multiplication(complex a, complex b) {
    return new complex(a.real * b.real - a.img * b.img, a.real * b.img + b.real * a.img);
  }

  public static complex inverse(complex a) {

    return new complex(
        a.real / (a.real * a.real + a.img * a.img), -a.real / (a.real * a.real + a.img * a.img));
  }

  public static complex division(complex a, complex b) {
    return multiplication(a, inverse(b));
  }

  public static complex subtraction(complex a, complex b) {
    return new complex(a.real - b.real, a.img - b.img);
  }
}
