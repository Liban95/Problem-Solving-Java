public class extends SavingsAccount {
    public SavingsAccount(String id, double initialDeposit){
        super(id,initialDeposit);
        if (initialDeposit >= 1000)   //if initial deposit is greater than 1000 the extra 10 is awarded
            balance = balance + 10;   
    }
   
    public boolean withdraw(double amount){
        int fee = 3;     
        balance = amount - fee;
        if(balance >= 10){    // if balance is greater than 10 will allow you to withdraw after checking balance
            return true;
        }
        else return false;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public double addInterest(double rate){
        rate = rate/100;//percentage value
        rate = rate/12;//over 12 months
        rate = rate * balance;
        balance = balance + rate;
        return rate;
    }
}




