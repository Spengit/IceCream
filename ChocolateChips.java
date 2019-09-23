
public class ChocolateChips extends ToppingsDecorator{
	
	IceCream icecream;
	
	public ChocolateChips(IceCream iceCream) {
		this.icecream = iceCream;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return icecream.toString() + " + chocolate chips";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return icecream.getCost() + 0.3;
	}

}
