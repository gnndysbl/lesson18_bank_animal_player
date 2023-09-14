package by.itacademy.java.lesson18bank;

import java.util.Objects;

public class CurrentAccount extends Account {

	public double overDraftLimit;

	public CurrentAccount(int accountNumber, double balance, String currency, double overDraftLimit) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.currency = currency;
		this.overDraftLimit = overDraftLimit;

	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overDraftLimit=" + overDraftLimit + ", accountNumber=" + accountNumber + ", balance="
				+ balance + ", currency=" + currency + "]";
	}

	public void setOverDraftLimit(double overDraftLimit) {
		overDraftLimit = overDraftLimit;
	}
	
	public double withdraw(double cashOut) {
		double tempBalance = getBalance() - cashOut;
		if ((tempBalance < 0 - overDraftLimit)) {
			throw new RuntimeException("Uncorrect balance or Exceeded the limit");
		} else {
			setBalance(tempBalance);
			return tempBalance;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(overDraftLimit);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CurrentAccount other = (CurrentAccount) obj;
		return Double.doubleToLongBits(overDraftLimit) == Double.doubleToLongBits(other.overDraftLimit);
	}
}