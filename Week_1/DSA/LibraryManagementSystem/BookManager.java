import java.util.Arrays;
import java.util.Comparator;

public class BookManager {
    private Book[] books;
    private int size;

    public BookManager(int capacity){
        books = new Book[capacity];
        size = 0;
    }
    //Add a book to array
    public boolean addBook(Book book) {
        if (size >= books.length) {
            return false;
        }
        books[size++] = book;
        return true;
    }
/*
3.	Implementation:
    	Implement linear search to find books by title.
    	Implement binary search to find books by title (assuming the list is sorted).
*/
    //Linear Search
    public Book linearSearch(String title){
        for (int i=0;i<size;i++){
            if(books[i].getTitle()==title){
                return books[i];
            }
        }
        return null;
    }

    //Binary search
    public Book binarySearch(String title){
        Arrays.sort(books,0,size, Comparator.comparing(Book::getTitle));
        int left = 0 ;
        int right = size-1;
        while(left<right){
            int mid = (left+right)/2;
            int compare = books[mid].getTitle().compareToIgnoreCase(title);
            if(compare==0){
                return books[mid];
            } else if (compare<0) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }

        }
        return null;
    }
    public void traverse(){
        for(int i=0;i<size;i++){
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {
        BookManager manager = new BookManager(10);
        manager.addBook(new Book(1,"The Origin","Dan Brown"));
        manager.addBook(new Book(2,"Fault in our stars","Robert green"));

        System.out.println("LIST OF ALL BOOKS");
        manager.traverse();

        System.out.println("SEARCH BOOK 'The Origin' IN LINEAR SEARCH");
        manager.linearSearch("The Origin");

        System.out.println("SEARCH BOOK 'The Origin' IN BINARY SEARCH");
        manager.binarySearch("The Origin");


    }

}

/*
4.	Analysis:
	Compare the time complexity of linear and binary search.
	    *The time complexity of Linear search is O(n) where n is the size of the array.
	    *The time complexity of binary search is O(log n). This algorithm has less time complexity and hence it is more efficient.
	Discuss when to use each algorithm based on the data set size and order.
	    *Linear Search is commonly used when the array is unsorted.
	    *Whereas the binary search can only be done on sorted array. Therefore they are used at larger datasets.

 */
