public class complex {
  double real;
  double img;

  complex(double real, double img) {
    this.real = real;
    this.img = img;
  }

  void print() {
    System.out.println(this.real + "+" + this.img + "i");
  }
}
