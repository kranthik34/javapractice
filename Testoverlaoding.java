package mywork;

public class Testoverlaoding {
	public static void main(String[] args) {

	
		System.out.println(Adder(10, 11));
		System.out.println(Adder(12, 21, 23));
	}

	public static int Adder(int a, int b) {
		int add = a + b;
		return add;
	}

	public static int Adder(int a, int b, int c) {
		int add = a + b + c;
		return add;
	}

}
