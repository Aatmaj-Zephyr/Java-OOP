package Engineering;
import java.util.Arrays;
public class Student implements Comparable{
    public int rollno;
    public String name;
    public int marks;
    public void display(){
       System.out.println(rollno);
       System.out.println(name);
       System.out.println(marks);
    }
    public int compareTo(Object A){
        Student B=(Student)A;
        if(B.marks==this.marks){
            return 0;
        }
        if(B.marks<this.marks){
            return 1;
        }
        return -1;
    }
}
