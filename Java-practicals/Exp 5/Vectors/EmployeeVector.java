import java.util.*;
public class EmployeeVector{
    Vector<Employee> EmployeeList = new Vector<Employee>();
    void create(Employee ... a){
        for (Employee i:a){
            EmployeeList.add(i);
        }
         sort();
    }
    void sort(){
        Collections.sort(EmployeeList);
    }
    void insert(Employee a){
        EmployeeList.add(a);
        sort();
    }
    void delete(String name){
        //ignore if element not found
         for (int i = 0; i < EmployeeList.size(); i++) {
            if(EmployeeList.get(i).name==name){
                EmployeeList.remove(i);
            }
        }
    }
    void delete(int ID){
        for (int i = 0; i < EmployeeList.size(); i++) {
            if(EmployeeList.get(i).ID==ID){
                EmployeeList.remove(i);
            }
        }
    }
    void display(){
       for (Employee i:EmployeeList){
       
           System.out.println(i);
       }
    }
}
