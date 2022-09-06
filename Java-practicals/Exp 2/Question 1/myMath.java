public abstract class myMath{
    //contains only static methods.
    private  myMath(){
        //private constructor to prevent instantialization..
    }
    public static double power(double x, int y){
        double temp=1;
        for (int i=y;i>0;i--){
        temp=temp*x;
        }
        return temp;
    }
    public static int factorial(int x){
        int temp=1;
        for (int i=x;i>0;i--){
        temp=temp*i;
        }
        return temp;
    }
    public static double exp(int x){
        //exponentition using binomial series expansion
        
           double temp=1;
        for(int i=1;i<10;i++){
            temp=temp+power(x,i)/factorial(i);
        }
        return temp;
    }
    
 public static double one_minus_x(double x){
        //  1/ 1-x using binomial series expansion
        
        if(x>=1){//x mus be greater than one.
            System.out.println("error");
            return 0;
        }
           double temp=1;
           for(int i=1;i<10;i++){
            temp=temp+power(x,i);
        }
        return temp;
    }
     public static double one_plus_x(double x, int n){
        //  (1+x)^n using binomial series expansion
        
           double temp=1;
           for(int i=1;i<=n;i++){
            temp=temp+factorial(n)*power(x,i)/(factorial(i)*factorial(n-i));
        }
        return temp;
    }
    
}
