package interview;

public class Sapiens {

	public static void main(String[] args) {

		test(10);
		test(new Integer(10));
		test((Integer) 0);
	}

	
	static void test(int x) {
		
		System.out.println(x);
	}
}
