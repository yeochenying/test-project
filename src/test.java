
public class test {

	public static void main(String[] args) {

		String msg1 = "Hello World";
		String msg2 = new String("Hello World");
		String msg3 = "hi";
		String msg4 = "Khairul here";
		
		if (msg1 == "Hello World") {
			System.out.println("A1. True");
		} else {
			System.out.println("A1. False");
		}

		if (msg2 == "Hello World") {
			System.out.println("A2. True");
		} else {
			System.out.println("A2. False");
		}

		if (msg1.equals("Hello World")) {
			System.out.println("A3. True");
		} else {
			System.out.println("A3. False");
		}

		if (msg2.equals("Hello World")) {
			System.out.println("A4. True");
		} else {
			System.out.println("A4. False");
		}
		
		if (msg1 == msg2) {
			System.out.println("A5. True");
		} else {
			System.out.println("A5. False");
		}
		
		if (msg1.equals(msg2)) {
			System.out.println("A6. True");
		} else {
			System.out.println("A6. False");
		}
		
		if (msg1.compareTo(msg2) == 0) {
			System.out.println("A7. True");
		} else {
			System.out.println("A7. False");
		}
		
//		test a = new test();
//		a.anotherQuestion1();
		
		int a = 5;
		System.out.println(cude(a));
	

	}

	static int cude(int theNum) {
	return theNum * theNum * theNum;
	}
	
	
}
