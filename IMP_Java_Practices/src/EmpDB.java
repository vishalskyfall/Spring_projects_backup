import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmpDB {
	public static List<Employee> getEmp() {
		List<Employee> emp = new ArrayList<Employee>();
		for (int i = 0; i <= 1000; i++) {
			emp.add(new Employee(i, "vishal " + i, Double.valueOf(new Random().nextInt(1000))));
		}
		return emp;
	}
}
