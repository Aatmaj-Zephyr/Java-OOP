public class student{
    int rollno;
    String name;
    student(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }
    void print(){
        System.out.println(rollno+"   "+name);
    }
}
