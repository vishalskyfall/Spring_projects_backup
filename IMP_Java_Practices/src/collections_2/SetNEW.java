package collections_2;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetNEW {
	public static void main(String[] args) {
		Set<Student> ss = new HashSet<>();
		
	    ss.add(new Student("Anuj", 2));
	    ss.add(new Student("Ramesh", 4));
	    ss.add(new Student("Shivam", 3));

	    ss.add(new Student("Rohit", 2));
//Collections.sort((List<Student>) ss);
//System.out.println(ss);
	    Student s1 = new Student("Anuj", 2);
	    Student s2 = new Student("Rohit", 2);
	    System.out.println(s1.equals(s2)); //roll number thi check thay so
	    System.out.println(ss);
	}
	
}
