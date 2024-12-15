package bok;

import java.util.Objects;

/**
 * 
 */
public class Book {
	public String isbns;
	public String author;
	public String name;
	public String editor;
	
	/**
	 * 
	 */
	public Book(String isbns, String author, String name, String editor) {
		super();
		this.isbns = isbns;
		this.author = author;
		this.name = name;
		this.editor = editor;
	}
	
	public String getIsbns() {
		return isbns;
	}
	public void setIsbns(String isbn) {
		this.isbns = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(author, editor, isbns, name);
	}
	/**
	 *
	 */
	/**
	 *
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(editor, other.editor)
				&& Objects.equals(isbns, other.isbns) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Book [isbns=" + isbns + ", author=" + author + ", name=" + name + ", editor=" + editor + "]";
	}
	public static void main(String[] args) {
		int suma;
		
		 suma = Integer.parseInt(args[1]);
		
		Book b = new Book ("961234567", "Cervantes", "D. Quijote·", "editor");	
        b.setAuthor("Cervante");	
        System.out.println(suma);
	}
}
