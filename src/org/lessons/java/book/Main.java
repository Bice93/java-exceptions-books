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
		
		/*
		 * Quando vengono inseriti i dati, verificare che siano corretti 
		 * (es. non accettare titolo o autore o editore vuoto, numero pagine ≤ 0). 
		 * Se ci sono errori, lanciare un’eccezione e gestirla mostrando a video il tipo di errore.
		 */
		
		for (int i = 0; i < library.length; i++) {

			Scanner s = new Scanner(System.in);

			System.out.println("Inserisci il titolo del libro");
			title = s.nextLine().trim();
			
			System.out.println("Inserisci il numero di pagine");
			try {
				numberPages = Integer.parseInt(s.nextLine());
				
			} catch (Exception e){
				numberPages= 0;
				System.out.println("Errore sul formato del numero pagina");
				return;
			}
			
			System.out.println("Inserisci il nome dell'autore");
			author = s.nextLine().trim();
			
			System.out.println("Inserisci il nome dell'editore");
			editor = s.nextLine().trim();
			
			//Book book;
			try {
				Book book = new Book(title, numberPages, author, editor);
				library[i]= book;
				
			} catch (Exception e) {
				System.out.println("Si è verificato un errore! " + e.getMessage());
				return;
			} finally {
				
				s.close();				
			}
			
		}
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i].toString() + "\n");
		}	

	}

}
