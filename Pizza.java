
public class Pizza {
	private String pizzaSize;
    private int cheeseT;
    private int pepperoniT;
    private int hamT;
    
    
    Pizza(){
    	this.pizzaSize = "";
    	this.cheeseT = 0;
    	this.pepperoniT = 0;
    	this.hamT = 0;
    }
    
    Pizza(String pizzaSize , int cheeseT , int pepperoniT , int hamT){
    	this.pizzaSize = pizzaSize;
    	this.cheeseT = cheeseT;
    	this.pepperoniT = pepperoniT;
    	this.hamT = hamT;
    }
    
    public Pizza(Pizza pizza1) {
		
	}

	public void setPizzaSize(String pizzaSize) {
    	this.pizzaSize = pizzaSize;
    }
    
    public String getPizzaSize() {
    	return pizzaSize;
    }
    
    public void setCheeseTop(int cheeseT) {
    	this.cheeseT = cheeseT;
    }
    
    public int getCheeseTop() {
    	return cheeseT;
    }
    
    public void setPepperoniTop(int pepperoniT) {
    	this.pepperoniT = pepperoniT;
    }
    
    public int getPepperoniTop() {
    	return pepperoniT;
    }
    
    public void setHamTop(int hamT) {
    	this.hamT = hamT;
    }
    
    public int getHamTop() {
    	return hamT;
    }
    
    public double calCost() {
    	if (pizzaSize == "small") {
    		return 10 + (cheeseT + pepperoniT + hamT) * 2;
    	}
    	else if (pizzaSize == "medium") {
    		return 12 + (cheeseT + pepperoniT + hamT) * 2;
    	}
    	else if(pizzaSize == "large") {
    		return 14 + (cheeseT + pepperoniT + hamT) * 2;
    	}
    	else
    		return 0;
    	
    }
    
    public void getDescription() {
        
        System.out.println ("Pizza size: " + pizzaSize + "\n Cheese toppings " 
   				+ cheeseT + " \nPepperoni toppings: "
   				+ pepperoniT + "\n Ham toppings: " + hamT
   				+ "\n Pizza cost: " + calCost());
        }
}
