
public class Sprinkles extends ToppingsDecorator{
	IceCream icecream;

	
	public String toString() {
		return icecream.toString() + " + sprinkles";
	}

	
	public double getCost() {
		// TODO Auto-generated method stub
		return icecream.getCost() + 0.2;
	}
	
	public Sprinkles(IceCream iceCream) {
		this.icecream = iceCream;
	
	}

}
