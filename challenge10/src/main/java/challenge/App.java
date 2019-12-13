package challenge;

public class App {
	public static void main(String[] args) {
		
		CollatzSequence(999999);
		
	}
	
	public static void CollatzSequence(int start) {
		
		int sequenceLength = 0;
		while(start != 1) {
			// number is even
			if(start%2 == 0) {
				start = start/2;
			}
			else {
				start = (3*start) +1;
			}
			System.out.println("next number is " + start);
			sequenceLength++;
		}
		
		System.out.println("sequence length : " + sequenceLength);
		
	}

}
