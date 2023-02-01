package org.lessons.java.book;

public class Book {

	private String title;
	private int numberPages;
	private String author;
	private String editor;
	
	public Book(String title, int numberPages, String author, String editor) throws Exception {
		
		setTitle(title);
		setNumberPages(numberPages);
		setAuthor(author);
		setEditor(editor);
		
	}
	
	/*
	 * Implementare i getter e setter di tutti gli attributi del libro gestendo anche in questo caso 
	 * eventuali errori di dati non corretti (che generano quindi eccezione).
	 */
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) throws Exception {
		validateString(title);
		this.title = title;
	}
	
	public int getNumberPages() {
		return numberPages;
	}
	
	public void setNumberPages(int numberPages) throws Exception{
		validateNumber(numberPages);
		this.numberPages = numberPages;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) throws Exception {
		validateString(author);
		this.author = author;
	}
	
	public String getEditor() {
		return editor;
	}
	
	public void setEditor(String editor) throws Exception {
		validateString(editor);
		this.editor = editor;
	}
	
	public void validateString(String inputString) throws Exception {
		if (inputString.isEmpty()) {
			throw new Exception("Inserire quello che ti viene richiesto!");
		}
	}
	
	public void validateNumber (int inputNumber) throws Exception {
		if  (inputNumber <= 0){
			throw new Exception("Il libro deve contenere almeno una pagina!");
		}
	}

	@Override
	public String toString() {
		return "Libro:\n title=" + title + ",\n numberPages=" + numberPages + ",\n author=" + author + ",\n editor=" + editor;
	}
	
	
}
