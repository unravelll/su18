import lab02
/**
 * This class represents a bank account whose current balance is a nonnegative
 * amount in US dollars.
 */
public class Account {

    public int balance;
    Account parentAccount;
    
    /** protect an account by other account */
    pubilc Account (int balance , Account parentAccount) {
    	this.balance = blance;
    	this.parentAccount = parentAc
    }

    /** Initialize an account with the given BALANCE. */
    public Account(int balance) {
        this.balance = balance;
    }

    /** Deposits AMOUNT into the current account. */
    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("Cannot deposit negative amount.");
        } else {
            balance += amount;
        }
    }

    /**
     * Subtract AMOUNT from the account if possible. If subtracting AMOUNT
     * would leave a negative balance, print an error message and leave the
     * balance unchanged.
     */
    public boolean withdraw(int amount) {
        // TODO
        if (amount < 0) {
            System.out.println("Cannot withdraw negative amount.");
            return false;
        } else if (balance < amount) {
        	if((parentAccount.balance+balance) < amount)
            System.out.println("Insufficient funds");
            return false;
            else {
            	blance = blance + parentAccount.balance - amount;
            	return true;
            	System.out.println("use your parentAccount for overdrafr protection. ");
            }
        } else {
            balance -= amount;
            return true;
        }
        
     public static void main (String []args) {
    	Account kethy = new Account (2000);
    	Account  megan = new Account (50, kethy);
    	boolean withdraw = megan.withdraw(1000);
     }
    }

    /**
     * Merge account OTHER into this account by removing all money from OTHER
     * and depositing it into this account.
     */
    public void merge(Account other) {
    	// TODO
    	while (other > 0) {
    		blance += other;
    	}
    }
}
