package letter;

import courriers.*;

public abstract class Letter<C extends Contents> {
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected C content;

	public Letter(Inhabitant sender, Inhabitant receiver, C content) {
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}
	
	/**
	 * return the letter cost
	 * @return int cost
	 */
	public abstract int getCost();


	public C getContent() {
		return content;
	}

	public void setContent(C content) {
		this.content = content;
	}

	public Inhabitant getSender() {
		return sender;
	}

	public void setSender(Inhabitant sender) {
		this.sender = sender;
	}

	public Inhabitant getReceiver() {
		return receiver;
	}

	public void setReceiver(Inhabitant receiver) {
		this.receiver = receiver;
	}
	/**
	 * debit the BankAccount of the sender of the letter cost
	 */
	public void debitBankAccount() {
		int beforeDebit = this.sender.getBankAccount().getAmount();
		this.sender.getBankAccount().setAmount(beforeDebit - this.getCost());
		System.out.println(this.getCost() + " euros is debited from " + this.sender.getName()
				+ " account whose balance is now " + this.sender.getBankAccount().getAmount() + " euros");
	}
	/**
	 * return true if is an urgent letter
	 * @return boolean false
	 */
	public boolean isUrgentLetter() {
		return false;
	}
	
	/**
	 * return the message display
	 * @return String message
	 */
	public String getMessage() {
		return " whose content is a";
	}

	/**
	 * execute what doing the letter
	 */
	public abstract void action();

}
