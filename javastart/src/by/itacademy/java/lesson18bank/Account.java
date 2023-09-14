package by.itacademy.java.lesson18bank;

import java.util.Objects;

//Базовый класс: Account с такими атрибутами, как accountNumber, balance 
//и такими методами, как deposit (), withdraw ().
//Производные классы: SavingsAccount, CurrentAccount.
//SavingsAccount может иметь дополнительные атрибуты/методы, такие как interestRate и addInterest().
//CurrentAccount может иметь такие атрибуты, как overdraftLimit.
//Имитируйте банковские операции для обоих типов счетов.

public abstract class Account {
	
	public int accountNumber;
	public double balance;
	public String currency;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double deposit(int cashIn) {
		balance = balance + cashIn;	
		return balance;
	}
	
	public double withdraw(double cashOut) {
		balance = balance - cashOut;	
		return balance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, balance, currency);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accountNumber == other.accountNumber && balance == other.balance
				&& Objects.equals(currency, other.currency);
	}
	
	

}
