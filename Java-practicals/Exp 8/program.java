import java.util.Random;

public class program implements Runnable{
    Thread t1;
    Thread t2;
    Thread t3;
     int number;
    public  program(){
        t1 = new Thread(this);
        
        t1.start();
        
        t2 = new Thread(this);
        t2.start();

        t3 = new Thread(this);
        t3.start();
    }

    @Override
    synchronized public void run() {
        if(number==0){
            //first thread runs
        Random myRandom = new Random();
         number = myRandom.nextInt(50);
        System.out.println(number);
        }
        else if(number%2==1){
            number = number*number;
            System.out.println(number);
        }
        else if(number%2==0){
            number = number*number*number;
            System.out.println(number);
        }
        
    }
}
