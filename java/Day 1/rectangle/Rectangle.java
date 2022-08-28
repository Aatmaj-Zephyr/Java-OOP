public class Rectangle {
  int length;
  int breadth;
  int area;

  Rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
    // default constructor
    this.area = this.setarea();
  }

  private int setarea() {
    // private method used in constructor
    area = length * breadth;
    return area;
  }
}
