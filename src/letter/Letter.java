package letter;

import courriers.*;

public abstract class Letter<C extends Contents> {
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected C content;
	protected int cost;

	public Letter(Inhabitant sender, Inhabitant receiver, C content) {
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}

	public abstract int getCost();

	public void setCost(int cost) {
		this.cost = cost;
	}

	public C getContent() {
		return content;
	}

	public void setContent(C content) {
		this.content = content;
	}

	public void setText(C content) {
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

	public void debitBankAccount() {
		int beforeDebit = this.sender.getBankAccount().getAmount();
		this.sender.getBankAccount().setAmount(beforeDebit - this.getCost());
		System.out.println(this.getCost() + " euros is debited from " + this.sender.getName()
				+ " account whose balance is now " + this.sender.getBankAccount().getAmount() + " euros");
	}

	public boolean isUrgentLetter() {
		return false;
	}

	public String getMessage() {
		return " whose content is a";
	}

	public abstract void action();

}
