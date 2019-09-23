
public class Cherry extends ToppingsDecorator{
	IceCream icecream;
	
	public Cherry(IceCream iceCream) {
		this.icecream = iceCream;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return icecream.toString() + " + a cherry on top";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return icecream.getCost() + 0.4;
	}

}
