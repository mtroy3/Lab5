import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        Bank.totalAccounts++;

    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    public void setAccountNumber(int num){
        this.accountNumber = num;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountBalance(double balance) {
        this.accountBalance = balance;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public void setInterestRate(double rate){
        this.interestRate = rate;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public void setInterestEarned(double rateEarned){
        this.interestEarned = rateEarned;
    }
    public double getInterestEarned(){
        return interestEarned;
    }
    public void setOwnerName(String n){
        this.ownerName = n;
    }

    public String getOwnerName() {
        return ownerName;
    }
}