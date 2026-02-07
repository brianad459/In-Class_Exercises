package testing;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Payable> paymentQueue = new ArrayList<>();
		
		CreditCards ccard = new CreditCards("Briana Deloatch", 0);
		MealPlan mealplan = new MealPlan("Ashton", 400);
		paymentQueue.add(ccard);
		paymentQueue.add(mealplan);
		
		for (int i = 0; i < paymentQueue.size(); i++ ) {
			Payable p = paymentQueue.get(i);
			p.processPayment(50.0);
		}
		
		System.out.println("Total Transaction: "+ PaymentMethod.totalTransactions);
		
	}

}
