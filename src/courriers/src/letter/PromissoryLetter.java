package letter;

import courriers.*;

public class PromissoryLetter extends Letter<AmountContent> {

	public PromissoryLetter(Inhabitant sender, Inhabitant receiver, AmountContent amount) {
		super(sender, receiver, amount);

	}

	/**
	 * return the amount in the letter
	 * 
	 * @return int amount
	 */
	public int getAmount() {
		return this.content.getContent();
	}

	/**
	 * set the amount in the letter
	 * 
	 * @param int
	 *            new amount
	 */
	public void setAmount(int amount) {
		this.content.setContent(amount);
	}

	/**
	 * execute what doing the letter
	 */
	@Override
	public void action() {

		this.receiver.getBankAccount().credit(this.getAmount());
		int amountReceiver = this.receiver.getBankAccount().getAmount();
		this.sender.getBankAccount().debit(this.getAmount());
		int amountSender = this.sender.getBankAccount().getAmount();
		System.out.println("- " + this.sender.getName() + " account is debited with " + this.getAmount()
				+ " euros, its balance is now " + amountSender + " euros");
		System.out.println("+ " + this.receiver.getName() + " account is credited with " + this.getAmount()
				+ " euros, its balance is now " + amountReceiver + " euros");
		this.sender.getCity().sendLetter(new ThanksLetter(this));
	}

	/**
	 * return the message display
	 * 
	 * @return String message
	 */
	public String getMessage() {
		return " promissory note letter" + super.getMessage() + " money content (" + this.content.getContent() + ")";
	}

	/**
	 * return the letter cost
	 * 
	 * @return int cost
	 */
	@Override
	public int getCost() {
		return (1 + (1 / 100) * this.getAmount());
	}

}
