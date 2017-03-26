package cmpt220;

public class CheckingAccount extends Account{
	protected double OVERDRAFT_LIMIT = -100;

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }


    public double withdraw(int amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
		return amount;
    }

    public String toString() {
        return "CheckingAccount{"+
                "mBalance=" + balance +
                '}';
    }
}
