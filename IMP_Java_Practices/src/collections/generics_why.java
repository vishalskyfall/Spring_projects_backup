package collections;

class IntPrinter {
	private int i;

	public IntPrinter(int i) {
		this.i = i;
	}

	public void print() {
		System.out.println(i);
	}
}

public class generics_why {
	public static void main(String[] args) {
		IntPrinter v = new IntPrinter(99);
		v.print(); // generics or collections were introduced because of this suppose if i want
					// same with float double string etc
	}
}
