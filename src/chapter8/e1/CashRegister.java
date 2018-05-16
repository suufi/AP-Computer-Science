package chapter8.e1;

import java.util.ArrayList;


public class CashRegister {

	ArrayList<Coin> coins = new ArrayList<Coin>();
	
	public void enterPayment(int coinCount, Coin coinType) {
		for (int i=0; i<=coinCount; i++) {
			coins.add(coinType);
		}
	}
	
}