package chapter8.e1;


public class Coin {

	String name;
	int value;
	
	public Coin(int aValue, String coinName) {
		this.value = aValue;
		this.name = coinName;
	}
	
	public double getValue() {
		return this.value;
	}

}

