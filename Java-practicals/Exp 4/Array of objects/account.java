public class account{
    private int  accountID;
    String nameOfAccountHolder;
    int balanceInAccount;
    
    public void set_accountID(int accountID){
        this.accountID=accountID;
    }
    public void set_nameOfAccountHolder(String nameOfAccountHolder){
        this.nameOfAccountHolder=nameOfAccountHolder;
    }
    public void set_balanceInAccount(int balanceInAccount){
        this.balanceInAccount=balanceInAccount;
    }
    public void displayAccountDetails(){
        System.out.println(accountID);
        System.out.println(balanceInAccount);
        System.out.println(nameOfAccountHolder);
    }
    public int get_accountID(){
        return accountID;
    }
    public boolean matchAccountId(int IDToBeMatched){
        return IDToBeMatched==accountID;
    }
}
