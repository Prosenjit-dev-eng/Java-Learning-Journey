/*
51.Create a Book class for a library system.
• Instance variables: title, author, isbn.
• Static variable: totalBooks, a counter for the total number of book
instances.
• Instance methods: borrowBook(), returnBook().
• Static method: getTotalBooks(), to get the total number of books in the
library.
*/
public class Book {

    private String title, author, isbn;
    private static int totalBooks = 0;
    private boolean isBorrowed;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }
    Book(String isbn){
        this("Unknown","Unknown",isbn);

    }
    static int getTotalBooks(){
        return totalBooks;
    }
    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book already Borrowed");
        }
        else {
            this.isBorrowed = true;
        }

    }
    void returnBook(){
        if(isBorrowed){
            System.out.println("Book already Borrowed");
            this.isBorrowed = false;
        }
        else{
            System.out.println("Book not Borrowed");
        }
    }
}
