//@FunctionalInterface
interface test {
	// void print(); functional should have only one abstract method
	void lamda(int i); // SAM Single Abstarct Method
}

class test2 implements test {
	public void print() {
		System.out.println("Implemented interface method");
	}

	public void lamda(int i) {
		System.out.println("here is your number : " + i);
	}
}

public class lamda_fun {

	public static void main(String[] args) {
		// interface is like contract that if you use one then you have to implement
		// it's method
		test2 t = new test2();
		// t.print();
		// or we can do
//		printThing(t); // both will work same
		// for above like we have to implement that method and we can call later on
		// in Lamda we can give main logic inside the function

		// printThing(() -> System.out.println("Implemented interface method"));
		// no name, no return type, no access modifiers needed, no { } also
		// test nopara = ()-> System.out.println("here is your number : ");
		test tt = (p) -> System.out.println("here is your number : " + p);

		// Lambda only being used when there is only one interface method
		printThing(tt);

	}

	static void printThing(test t) {
		// t.print();
		t.lamda(99);
	}

}
