package chapter13.e1;

public class Sentence {

	String sentence = "";
	
	public Sentence(String sentance) {
		this.sentence = sentance;
	}
	
	public String reverse() {
				
		if (sentence.length() <= 1) {
			return sentence;
		} else {
			char c = sentence.charAt(0);
			sentence = sentence.substring(1);
			return reverse() + c;
		}
	}
	
}
