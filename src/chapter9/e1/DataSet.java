package chapter9.e1;


public class DataSet {
	 private double sum;
	 private Measurable maximum;
	 private int count;

	 public void add(Measurable x) {
		 sum = sum + x.getMeasure();
		 if (count == 0 || maximum.getMeasure() < x.getMeasure()) {
			 maximum = x;
		 }
		 
		 count++;
	 }
	 
	 public Measurable getMaximum() {
		 return maximum;
	 }
}