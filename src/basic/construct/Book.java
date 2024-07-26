package construct;

public class Book {
	String title;
	String author;
	int page;
	
	Book(){
		this("", "", 0);
	}
	
	Book(String title, String author, int page){
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	Book(String title, String author){
		this(title, author, 10);
	}
	
	void displayInfo() {
		System.out.println(title+" "+author+" "+page);
	}
}
