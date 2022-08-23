package test;

public class degree {

	public static void main(String[] args) {
		DGree(12, 37);
	}

	public static void DGree(double h, double m) {

//		double h1 = h * 30;// System.out.println(h1);
		double h2 = (m * (0.5)); // System.out.println(h2);
//		h = h1 + h2;
		m = (m * 6);
		System.out.println(h2);
		double sum = Math.abs(m - h2);
		System.out.println("Angle from hour to minute hand :" + sum);
		System.out.println("Angle from min to hour hand :" + (360 - sum)); 
		
		// in above min to hour and hour to min logic in which i was super confused. 
		// I have figured it out in my page but i know it was sign of bad preparation from my end.
		// which i was not expecting but as you said We need to be prepare for anything.
	}
}
