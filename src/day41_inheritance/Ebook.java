package day41_inheritance;

public class Ebook extends Book {
	/*
    title (inherited)
    author (inherited)
    price (inherited)
    size (declared)
    pages (declared)
    readbook() (declared)
    toString()(inherited)
     */
	
	public String size;
	public int pages;
	
	public void readbook(){
		System.out.println("reading "+title);
	}
	
	
	
}
