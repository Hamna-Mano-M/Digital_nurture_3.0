/*
1.	Understand Search Algorithms:
	Explain linear search and binary search algorithms.
	    *The linear Search algorithm is a simple algorithm where it searches every element in the array to find the target.
	    *The Binary Search algorithm divides the array into two equal parts after sorting it and searches both the parts simultaneously. This reduces the time complexity and is more efficient.
2.	Setup:
	Create a class Book with attributes like bookId, title, and author

 */
public class Book {
    private int BookId;
    private String title;
    private String author;

    public Book(int book, String title, String author){
        this.BookId = BookId;
        this.author = author;
        this.title = title;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString(){
        return "BOOK [BookId = "+BookId+", Title = "+title+", Author name = "+author+" ]";
    }
}
