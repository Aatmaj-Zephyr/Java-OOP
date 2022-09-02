public class complex {
  double real;
  double img;

  complex(double real, double img) {
    this.real = real;
    this.img = img;
  }

  static void print(complex a) { // static method
    System.out.println(a.real + "+" + a.img + "i");
  }
}
