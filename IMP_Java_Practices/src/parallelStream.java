import java.util.List;
import java.util.stream.IntStream;

public class parallelStream {
	public static void main(String[] args) {
		long start = 0;
		long end = 0;
		start = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::print);
		end = System.currentTimeMillis();
		System.out.println("\n Sequential order will be same : " + (end - start));
		
		/*
		 * start = System.currentTimeMillis(); IntStream.range(1,
		 * 100).parallel().forEach(System.out::print); end = System.currentTimeMillis();
		 * System.out.println("\n Parallel can't plan order as threads: " + (end -
		 * start));
		 * 
		 * IntStream.range(1, 5).forEach(x->{
		 * System.out.println(Thread.currentThread().getName()+" "+x); });
		 * IntStream.range(1, 5).parallel().forEach(x->{
		 * System.out.println(Thread.currentThread().getName()+" "+x); });
		 */
		
		List<Employee> emp = EmpDB.getEmp();
		//normal stream
		start = System.currentTimeMillis();
		double sim = emp.stream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("\n Sequential order will be same : " + (end - start));
		
		//parallel
		start = System.currentTimeMillis();
		double simP = emp.parallelStream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("\n Parallel order will not same : " + (end - start));
	}
}
