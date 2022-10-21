abstract class shape{
    int numberOfSides;
    double lengthOfEachSide;
    shape(double lengthOfEachSide){
        this.lengthOfEachSide=lengthOfEachSide;
    }
    double perimeter(){
        return numberOfSides*lengthOfEachSide;
    }
    abstract double area();
}