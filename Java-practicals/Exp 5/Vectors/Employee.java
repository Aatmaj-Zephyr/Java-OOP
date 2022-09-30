import java.util.*;
class Employee implements Comparable<Employee>{
    String name;
    int ID;
    int salary;
    Employee(String name,int ID,int salary){
        this.name=name;
        this.ID=ID;
        this.salary=salary;
    }
    public String toString(){
        return "Employee "+name+" id "+ID+" earns "+salary+" $";
    }
    public int compareTo(Employee b){
    
       if (salary>b.salary){
           return 1;
       }
       else if(salary<b.salary){
           return -1;
       }
       return 0;
    }
}
