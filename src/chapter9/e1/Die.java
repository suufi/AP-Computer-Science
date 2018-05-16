package chapter9.e1;

import java.util.Random;

public class Die implements Measurable {
	int currentValue;
	Random randomGen = new Random();
	
	public Die() {
		this.currentValue = 0;
	}
	
	public Die(boolean random) {
		if (random) {
			this.roll();
		}
	}
	
	public void roll() {
		currentValue = randomGen.nextInt(6);
	}
	
	public int getMeasure() {
		return this.currentValue;
	}
	
	public String toString() {
		return "This die is a " + this.currentValue;
	}
	
}