package pattern.structural.bridge;

/**
 * Created by justin
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();

}
