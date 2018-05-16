package chapter9.e1;

public class DataSetTester {

	public static void main(String[] args) {
		DataSet data =  new DataSet();
		data.add(new Die(true));
		data.add(new Die(true));
		data.add(new Die(true));
		data.add(new Die(true));
		data.add(new Die(true));
		
		Measurable max = data.getMaximum();
		Die maxDie = (Die) max;
		
		System.out.println("Highest die is a: " + maxDie);
	}

}