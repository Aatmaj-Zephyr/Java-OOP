public class EmptyVectorException extends Throwable {
    public EmptyVectorException ()  
    {  
        // callng the constructor of parent Exception  
        super("Error: Vectors cannot be empty");  
    }  
}
