package java_basics;
class Bird{
	public void sing() {
		System.out.println("treet");
	}
}

class Robin extends Bird{
	public void sing(String s) {
		System.out.println("tiddle " + s);
	}
}
public class polly {
	public static void main(String[] args) {
		Robin b = new Robin();
		b.sing();
	}
}
