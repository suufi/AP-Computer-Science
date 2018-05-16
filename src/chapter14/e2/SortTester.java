package chapter14.e2;

import java.util.ArrayList;

public class SortTester {

	public static void main(String[] args) {
		Coin[] coins = new Coin[4];
		
		coins[0] = new Coin(25, "quarter");
		coins[1] = new Coin(10, "dime");
		coins[2] = new Coin(5, "nickel");
		coins[3] = new Coin(1, "penny");
		
		System.out.println("BELOW IS UNSORTED");
		
		for (Coin coin : coins) {
			System.out.println(coin.getValue());
		}
		
		sort(coins);
		
		System.out.println("\nBELOW IS SORTED");
		
		for (Coin coin : coins) {
			System.out.println(coin.getValue());
		}
		
	}
	
	public static Coin[] sort(Coin[] coins) {
		
		for (int i = 0; i < coins.length - 1; i++) {
			int minPos = minimumPosition(coins, i);
			swap(coins, minPos, i);
		}
		return coins;
		
	}

	private static int minimumPosition(Coin[] coins, int from) {
		int minPos = from;
		for (int i = from + 1; i < coins.length; i++)
			 if (coins[i].getValue() < coins[minPos].getValue()) minPos = i;
		return minPos;
	}
	
	private static void swap(Coin[] coins, int i, int j) {
		Coin temp = coins[i];
		coins[i] = coins[j];
		coins[j] = temp;
	}

}
