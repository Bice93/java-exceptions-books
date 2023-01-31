package org.lessons.java.book;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String title, author, editor;
		int numberPages;
		
		//	Scrivere un programma che inserisce n libri in un array.
		Book[] library = new Book[2];
		
		/*	Chiede i dati di un libro (titolo, numero pagine, autore, editore),
			istanzia un nuovo oggetto della classe Book e lo inserisce nell’array.
			Lo fa per il numero di elementi previsti nell’array.
		*/
		
		for (int i = 0; i < library.length; i++) {
			Scanner s = new Scanner(System.in);
			System.out.println("Inserisci il titolo del libro");
			title = s.nextLine();
			
			System.out.println("Inserisci il numero di pagine");
			numberPages = Integer.parseInt(s.nextLine());
			
			System.out.println("Inserisci il nome dell'autore");
			author = s.nextLine();
			
			System.out.println("Inserisci il nome dell'editore");
			editor = s.nextLine();
			
			library[i]= new Book(title, numberPages, author, editor);
			
			s.close();
		}
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i].toString() + "\n");
		}	

	}

}
