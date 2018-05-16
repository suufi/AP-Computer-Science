package chapter9.e14;

public class Coin implements Comparable {

	String name;
	int value;
	
	public Coin(int aValue, String coinName) {
		this.value = aValue;
		this.name = coinName;
	}
	
	public double getValue() {
		return this.value;
	}

	public int compareTo(Object other) {
		if (((Coin) other).getValue() > this.getValue()) {
			return -1;
		} else if (((Coin) other).getValue() == this.getValue()) {
			return 0;
		} else {
			return 1;
		}
	}
}
