public class vector {
    double i;
    double j;
    double k;
    vector(double i, double j, double k){
        this.i=i;
        this.j=j;
        this.k=k;
    }
    vector() throws EmptyVectorException //vector cannot be empty
    {
        throw new EmptyVectorException();
    }
    
    public static vector sum(vector A, vector B){
        return new vector(A.i+B.i,A.j+B.j,A.k+B.k);
        
    }
    public static double dot_product(vector A, vector B){
        return A.i*B.i+A.j*B.j+A.k*B.k;
        
    }
    public static vector cross_product(vector A, vector B){
        
     return new vector(A.j*B.k-B.j*A.k,-A.i*B.k+A.k*B.i,A.i*B.j-B.i*A.j);   
    }
    public void print(){
        System.out.println(this.i+"i+ "+this.j+"j+ "+this.k+"k");
    }
    
}
