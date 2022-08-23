import java.util.Arrays;

public class comparible_comparitor {
	public static void main(String[] args) {
		int[] myA = { 5, 7, 1, 20 };
		Arrays.sort(myA);
		System.out.println(Arrays.toString(myA));

		Employee[] emp = new Employee[3];
		emp[0] = new Employee(11, "Vishal", 1000);
		emp[1] = new Employee(9, "niki", 1000);
		emp[2] = new Employee(1, "avishwa", 1000);
		Arrays.sort(emp);
		System.out.println(Arrays.toString(emp));
		Arrays.sort(emp,Employee.ne);
		System.out.println("with comparator "+Arrays.toString(emp));
	}
}
