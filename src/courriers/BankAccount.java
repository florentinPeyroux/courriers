package courriers;

public class BankAccount {
	
	private int amount ;
	
	public BankAccount(int amount){
		 this.amount = amount;
	 }
	
	public int getAmount (){
		return this.amount;
	}
	
	public void setAmount(int amount){
		this.amount=amount;
	}
	 
	public void credit (int amount){
		this.amount=this.amount + amount;
	}
	
	public void debit (int amount){
		this.amount=this.amount - amount;
	}
	

}
