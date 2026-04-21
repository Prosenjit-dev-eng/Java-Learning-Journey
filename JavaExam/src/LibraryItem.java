/*
* Start with a base class LibraryItem that includes common
attributes like itemID, title, and author, and methods like
checkout() and returnItem(). Create subclasses such as Book,
Magazine, and DVD, each inheriting from LibraryItem. Add unique
attributes to each subclass, like ISBN for Book, issueNumber for
Magazine, and duration for DVD.*/
public class LibraryItem {
    private int itemID;
    private String title, author;
    public LibraryItem(int itemID, String title, String author) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
    }
}
class Book1 extends LibraryItem {
    private final int ISBN;
    Book1(int itemID, String title, String author, int isbn) {
        super(itemID, title, author);
        this.ISBN =  isbn;
    }
}
class Magazine extends LibraryItem {
    private final int issueNumber;
    Magazine(int itemID, String title, String author, int issueNumber) {
        super(itemID, title, author);
        this.issueNumber = issueNumber;
    }
}
class DVD extends LibraryItem {
    private final int duration;
    DVD(int itemID, String title, String author, int duration) {
        super(itemID, title, author);
        this.duration = duration;
    }
}