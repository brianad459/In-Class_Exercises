package testing;

public class CreditCards extends PaymentMethod {
	
	private double creditLimit; 
	
	public CreditCards(String accountHolder, double balance) {
		super(accountHolder, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processPayment(double amount) {
		if (balance + creditLimit >= amount) {
			System.out.println("Transaction Declined");
		}
		else {
			double purchase = amount - creditLimit ;
			totalTransactions++;
		}
		
	}

	@Override
	public String getPaymentStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void validateAccount() {
		// TODO Auto-generated method stub
		
	}

}
