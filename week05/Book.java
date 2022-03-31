package week05;

public class Book {
	String title, author;
	
	public Book(String title) {
		this.title = title;
		this.author = "작가미상";
	}

	public Book(String title, String author) {
		this.title =title;
		this.author = author;
	}

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자","쌩떼쥐베리");
		Book lovestory =  new Book("춘향전");
		
		System.out.println(littlePrince.title + "  " + littlePrince.author);
		System.out.println(lovestory.title + "  " + lovestory.author);
	}
}
