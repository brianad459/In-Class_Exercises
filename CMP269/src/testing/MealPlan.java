package testing;

public class MealPlan extends PaymentMethod {

	

	public MealPlan(String accountHolder, double balance) {
		super(accountHolder, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void validateAccount() {
		if (balance < 0) {
			System.out.println("MealPlan NOT verified");
		}
		else {
			System.out.println("MealPlan verified");

		}
		
	}

	public void processPayment(double amount) {
		if (amount <= 0 ) {
			System.out.println("Not correct amount");
		
		}
		if (balance >= amount) {
			balance -= amount;
			validateAccount();
		}
		else {
			System.out.println("No money");

		}
		
	}

	@Override
	public String getPaymentStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	

}
