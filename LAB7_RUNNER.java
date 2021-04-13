
public class LAB7_RUNNER {
	public static void main(String[] args) {
			Pizza pizza1 = new Pizza ("small", 1,2,2);
	        Pizza pizza2 = new Pizza ("medium", 3,2,1);
	        Pizza pizza3 = new Pizza ("large", 1,3,1);
	        
	        PizzaOrder order1 = new PizzaOrder();
			order1.setNumPizzas(3);
			order1.setPizza1(pizza1);
			order1.setPizza2(pizza2);
			order1.setPizza3(pizza3);
			double total1 = order1.calcTotal();
			
			order1.getPizza1().getDescription();
			order1.getPizza2().getDescription();
			System.out.println("Total cost1: " + total1);


	}
}
