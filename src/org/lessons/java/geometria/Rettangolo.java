package org.lessons.java.geometria;

public class Rettangolo {
	public int base;
	public int altezza;
	
	void calcolaArea() {
		int area = base * altezza;
		System.out.println("Area del tuo rettangolo: " + area);
	}
	
	void calcolaPerimetro() {
		int perimetro = (base * 2) + (altezza * 2);
		System.out.println("Perimetro del tuo rettangolo: " + perimetro);
	}
}
