package cmpt220;

public class SavingsAccount extends Account{
	protected double OVERDRAFT_LIMIT = 0;

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }


    public double withdraw(int amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
		return amount;
    }


    public String toString() {
        return "SavingsAccount{" +
                "mBalance=" + balance +
                '}';
    }
}
