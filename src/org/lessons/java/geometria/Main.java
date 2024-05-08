package org.lessons.java.geometria;

import java.util.Iterator;
import java.util.Scanner;

/*
chiedete all’utente di inserire, da console, i valori di base e di altezza con cui istanziare un nuovo Rettangolo.
Dopo averlo istanziato, stampate a video il perimetro e l’area.
BONUS Aggiungere alla classe Rettangolo un metodo disegna che disegna in console il rettangolo con le sue dimensioni,
come nell’immagine allegata
*/

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Rettangolo rettUtente = new Rettangolo();
		
		// chiediamo all-utente le misure del rettangolo
		System.out.println("Inserisci l'altezza del rettangolo: ");
		rettUtente.altezza = input.nextInt();
		
		System.out.println("Inserisci la base del rettangolo: ");
		rettUtente.base = input.nextInt();
		
		// invochiamo i metodi
		rettUtente.calcolaPerimetro();
		rettUtente.calcolaArea();
		
		//EXTRA
		System.out.println();
		
		StringBuilder builderBasi = new StringBuilder();
				for (int i = 0; i < rettUtente.base; i++) {
					builderBasi.append("o");	
				}
		StringBuilder builderSpazi = new StringBuilder();
			for (int i = 0; i < (rettUtente.base - 2); i++) {
				builderSpazi.append(" ");
			}
			
		//output
		System.out.println(builderBasi);
		for (int i = 0; i < (rettUtente.altezza - 2); i++)	{
			System.out.println("o" + builderSpazi + "o");
		}
		System.out.println(builderBasi);
	}
}



//GGWPEZ è stato divertente
