

public class Test {

	public static void main(String[] args) {
		Counter c1 = new Counter(2);
		Counter c2 = new Counter(5);
		int current = c1.currentVal;
		current = c1.inc();
		current = c1.getCurrentVal();
		System.out.println(current + c2.getCurrentVal());
		
	}

	/**
	for test-expect
	assertEquals(expect, actual);
			
	*/
	public void showErrorMessage(String message) {
		message = "code error";
	}


	
}
