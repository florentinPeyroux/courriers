package courriers;

public class Inhabitant {
	
	private String name;
	private City city;
	private BankAccount bankAccount ;
	
	public Inhabitant (String name, City city, int amount){
		this.name = name;
		this.city = city;
		this.bankAccount = new BankAccount(amount);
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getNameCity (){
		return this.city.getName();
	}
	
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public BankAccount getBankAccount(){
		return this.bankAccount ;
	}
	
	

}
