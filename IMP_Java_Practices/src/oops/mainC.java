package oops;

import encapsulation.enc;

public class mainC {
	public static void main(String[] args) {
		
		
//		person p1 = new person();
//		System.out.println(p1.t);
//		person p2 = new person(2); // both will have diff memory and values	
//		System.out.println(p2.t);
//		dev d = new dev(2);
//		System.out.println(d.t);
//		person p = new dev(2);
//		p.walk(2);
//		person p1 = new person();
//		p1.walk(2); //run time poly
		
		enc e = new enc();
		e.dowork();
	}
}

class person {
	 int t;
	public person(){
		 t=9;
		System.out.println("no args");
	}
	public person(int t) {
		this();
		System.out.println("args ");
		this.t =t;
	}
	public void walk(int t) {
		System.out.println("walked c"+t);
	}
	String name;
	int age;
}

//polymorphism  walk and walk(int t) compile time polymorphism
// badha na parrent object class hase

class dev extends person{
	public dev(int t) {
		super(t);
	}
	public void walk(int t) {
		System.out.println("walked "+t);
	}
}



