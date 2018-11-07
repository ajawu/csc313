class Bank{
    String name;
    String accountNumber;
    double balance;

    public void startValues(){
        name = "unknown";
        accountNumber = "0000000000";
        balance = 0;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount <= (balance - 500)){
            balance -= amount;
        }else{
            System.out.println("Insufficient Funds");
        }
    }

}

public class BankDemo{
    public static void main(String[] args) {
        Bank ajawu = new Bank();
        ajawu.startValues();
        ajawu.deposit(10000);
        ajawu.withdraw(5000);
        ajawu.displayDetails();
    }
}