class square extends shape{
    square(double lengthOfEachSide){
        super(lengthOfEachSide);
        this.numberOfSides=4;
    }
    double area(){
        return 0.5*lengthOfEachSide*lengthOfEachSide;
    }
}