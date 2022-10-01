import java.util.*;
public class experiment4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,id,ch=1,top=0;
        String name;
        double balance;
        System.out.println("Enter the number of accounts");
        n = sc.nextInt();
        customer arr[] = new customer[(n+1)];
        arr[n]= new customer(0,"",0.0);
        while(ch!=0){
            System.out.println("Enter 1 to add an account");
            System.out.println("Enter 2 to delete an account");
            System.out.println("Enter 3 to display an account");
            System.out.println("Enter -1 to exit");
            ch = sc.nextInt();
            switch(ch){
                case -1:
                    ch=0;
                break;
                case 1:
                    System.out.println("Enter id, name and balance");
                    id = sc.nextInt();
                    name = sc.next();
                    balance = sc.nextDouble();
                    arr[top] = new customer(id,name,balance);
                    top++;
                break;
                case 2:
                    System.out.println("Enter id to delete");
                    id = sc.nextInt();
                    for(int i=0;i<top;i++){
                        if(arr[i].aid==id){
                            for(int j=i;j<top;j++){
                                arr[j].aid = arr[j+1].aid; 
                                arr[j].name = arr[j+1].name; 
                                arr[j].balance = arr[j+1].balance;
                            }
                        }
                    }
                    top--;
                break;
                case 3:
                    if(top==0){
                        System.out.println("There is nothing to display\n");
                    }
                    for(int i=0;i<top;i++){
                        arr[i].display();
                        System.out.println();
                    }
                break;
                default:
                    System.out.println("Enter a correct choice");
                break;
            }
        }
        sc.close();
    }
}
class customer{
    int aid;
    String name;
    double balance;
    customer(int account_id,String customer_name,double customer_balance){
        aid = account_id;
        name = customer_name;
        balance = customer_balance;
    }
    customer(){
        aid = 0;
        name = "";
        balance = 0.0;
    }
    void display(){
        System.out.println("Account id is "+aid);
        System.out.println("Customer name is "+name);
        System.out.println("Account balance is "+balance);
    }
}
