import java.util.function.*;

class person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Functionals_interFaces {

	public static void main(String[] args) {
		/*
		 * //1) Predicate boolean result Predicate<String> s = str->str.length()>5;
		 * //checking if string's length is >5 System.out.println(s.test("vishal")); //
		 * true or false
		 */
		// 2) Consumer only consumes
		/*
		 * person p = new person(); Consumer<person> setname = t->t.setName("vishal");
		 * setname.accept(p); System.out.println(p.getName());
		 */

		// 3) Function - i/o
		/*
		 * Function<Integer, String> getInt = t ->t*10+" Vishal";
		 * System.out.println(getInt.apply(2));
		 */

		// 4) Supllier no i/o
		/*
		 * Supplier<Double> getRandom = ()->Math.random();
		 * System.out.println(getRandom.get());
		 */
	}
}
