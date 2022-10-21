class triangle extends shape{
    triangle(double lengthOfEachSide){
        super(lengthOfEachSide);
        this.numberOfSides=3;
    }
    double area(){
        return 0.4330*lengthOfEachSide*lengthOfEachSide; //equilateral triangle
    }
}