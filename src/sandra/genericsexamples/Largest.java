package sandra.genericsexamples;

public class Largest {

	public static <T extends Comparable<T>> T max(T a, T b) {
		return a.compareTo(b) >= 0 ? a : b;
	}

	public static void main(String[] args) {

		System.out.println("largest of 1 and 2 is " + max(1, 2));
		System.out.println("largest of 1.0 and 2.1 is " + max(1.0, 2.1));
		System.out.println("largest of 10.56D and 2.87D: " + max(10.56D, 2.87D));
		System.out.println("largest of 10F and 2F is " + max(10F, 2F));
	}

}
