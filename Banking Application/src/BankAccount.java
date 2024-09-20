public class BankAccount {

    private double balance;

    //constructor
    public BankAccount(double intialBalance) {
        this.balance = intialBalance;
    }

    public void Deposit(double amount){
        if(amount >0){
            balance += amount;
            System.out.println("Deposited: $   "+ amount + "to your account") ;
        }
        else{
            System.out.println("Invalid deposit amount, try again");
        }
    }
    public void Withdraw(double amount){
        if(amount>0 && balance ==0 && amount >= balance){
            balance -= amount;
            System.out.println("Withdrew: $  " + amount + "from your account");
        } else if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            System.out.println("Invalid withdrawal amount, try again");
        }
    }
    public void checkBalance(){
        System.out.println("You have: $ in your account"+balance);
    }
}
