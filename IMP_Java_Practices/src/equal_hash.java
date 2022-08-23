
public class equal_hash {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("john");
		Employee e2 = new Employee();
		e2.setId(1);
		e2.setName("vishal");

		System.out.println("Shallow Comparison : " + (e1 == e2)); // memory comparison different so false
		System.out.println("Deep Comparison : " + (e1.equals(e2))); // false as well so make override of equals
//		after implementing override of equals it will return true
		
		System.out.println(e1.hashCode() +" "+e2.hashCode());
	}
}
