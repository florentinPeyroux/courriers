package test;

import static org.junit.Assert.*;

import org.junit.Test;

import courriers.BankAccount;

public class BankAccountTest {
	@Test
	public void debitTest() {
		BankAccount bankAccount = new BankAccount(5000);
		bankAccount.debit(50);
		assertEquals(bankAccount.getAmount(),4950);
	}
	@Test
	public void creditTest() {
		 BankAccount bankAccount = new BankAccount(5000);
		bankAccount.credit(50);
		assertEquals(bankAccount.getAmount(),5050);
	}
	
	

}
