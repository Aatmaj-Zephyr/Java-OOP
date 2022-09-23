public class bank{
    account [] arrayOfAccounts;
    int topPointer;
    bank(int numberOfAccounts){
        arrayOfAccounts = new account[numberOfAccounts];
        topPointer=0;
    }
    void addAccount(){
        arrayOfAccounts[topPointer] = new account();
        arrayOfAccounts[topPointer].set_accountID(topPointer);
        topPointer++;
    }
    void deleteAccountByAccountID(int accountID){
        for (int i =0;i<topPointer;i++){
            if(arrayOfAccounts[i].matchAccountId(accountID)){
                removeAccountAtPosition(i);
            }
        }
    }
    private void removeAccountAtPosition(int position){
          for (int i =position;i<topPointer;i++){
        arrayOfAccounts[i]=arrayOfAccounts[i+1];
    }
    topPointer--;
    }
    public account getNewAccountInstance(){
        if(topPointer!=0){
        return arrayOfAccounts[topPointer-1];
        }
        else{
            throwEmptyAccountException();
            return null;
        }
    }
    private void throwEmptyAccountException(){
        System.out.println("Error! Bank is empty");
    }
     public void displayAllAccounts(){
         for (int i =0;i<topPointer;i++){
              arrayOfAccounts[i].displayAccountDetails();
              System.out.println(i);
         }
     }
}
