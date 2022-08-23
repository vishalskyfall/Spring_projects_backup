package collections_2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class hash {
public static void main(String[] args) { // no duplicates
	
	Set<Integer> s = new HashSet<>();
	s.add(11);
	s.add(56);
	s.add(69);
	s.add(1112);
	//darek no unique hash bane and e hash mujab sort ne get thay
	s.add(69);s.remove(69); //contains pan 6, isempty size() set.clear
	System.out.println(s); ;//prints uneven with hashing
	//linked has set ma order maintain rahe bas baki same 
	
	Set<Integer> ss = new TreeSet();//for sorted forms
	ss.add(1111);
	ss.add(56);
	ss.add(69);
	ss.add(1112); System.out.println(ss); // BNT no use thay  and ologn ma kam thay mast 
}
}
