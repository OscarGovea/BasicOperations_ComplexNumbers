package main;
import complex.Complex;

public class Main {
	public static void main(String[] args) {
		Complex complejo1= new Complex(5,2);
		Complex complejo2= new Complex(2,-3);
		Complex complejo3= new Complex(0,0);		
		
		complejo3.sus(complejo1, complejo2);
		System.out.println("Complejo1: ("+complejo1.getReal()+") + ("+complejo1.getImg()+")i");
		System.out.println("Complejo2: ("+complejo2.getReal()+") + ("+complejo2.getImg()+")i");
		System.out.println("Multiplicación->Complejo1 * Complejo 2");
		System.out.println("Complejo3: ("+complejo3.getReal()+") + ("+complejo3.getImg()+")i");
	}
}
