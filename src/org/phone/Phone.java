package org.phone;

public class Phone {
public void phoneInfo(long a) {
	System.out.println("Sim No is:");
	long b = a;
	System.out.println(b);
}
public void phoneInfo(int a, String c) {
	System.out.println("Phone Model is:");
	int b = a;
	String d = c;
	System.out.println(b);
	System.out.println(d);
	
}
public static void main(String[] args) {
	Phone ph = new Phone();
	ph.phoneInfo(89396606);
	ph.phoneInfo(55,"OMR");
	
	
}
}
