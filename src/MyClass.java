import java.util.ArrayList;

public class MyClass {
	
	public static void main (String... args) { 
		int a = 5;
//		System.out.println(cude(a));
		
		MyClass my = new MyClass();
		my.question2(2);
//		my.question3();
//		my.question4();
	}
	
	int cude(int theNum) {
		return theNum * theNum * theNum;
	}

	private void question2(int val) {
		switch (val)
		{ 
		case 1: System.out.print("P");
		case 2:
		case 3: System.out.print("Q");
				break;
		case 4: System.out.print("R");
		default: System.out.print("S");
		}

	}
	
	private void question3() {
		char[] c = new char[100];
		System.out.println("c > " +c[50]);
		Object ee;
	}
	
	private void question4() {
		ArrayList obj = new ArrayList();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add(1, "D");
        System.out.println(obj);
	}
	
}
