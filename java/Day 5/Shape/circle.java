class circle extends shape{
    circle(double lengthOfEachSide){
               super(lengthOfEachSide);

    }
    double perimeter(){
        return lengthOfEachSide*3.141*2;
    }
    double area(){
        return 3.141*lengthOfEachSide*lengthOfEachSide;
    }
}