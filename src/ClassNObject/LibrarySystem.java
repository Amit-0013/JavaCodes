//Create a Book class for a library system.
//• Instance variables: title, author, isbn.
//• Static variable: totalBooks, a counter for the total number of book
//instances.
//• Instance methods: borrowBook(), returnBook().
//        • Static method: getTotalBooks(), to get the total number of books in the
//library.
package ClassNObject;

public class LibrarySystem {
    static int totalNumberOfBooks;
    String title;
    String author;
    int isbn;
    boolean isBorrowed;


    static{
        totalNumberOfBooks = 0;
    }
    {
        totalNumberOfBooks++;
    }
    LibrarySystem(String title , String author , int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }
    LibrarySystem(int isbn){
        this("unkown" , "unkown" , isbn);
    }
    public static int getTotalBooks(){
        return totalNumberOfBooks;
    }
    public void borrowBook(){
        if(isBorrowed){
            System.out.println("The book is already borrowed.");
        }else {
            System.out.println("Thanks! Enjoy reading " + this.title);
            this.isBorrowed = true;
        }
    }
    public void returnBook(){
        if(isBorrowed){
            System.out.println("Thanks for returning the book.");
            this.isBorrowed = false;
        } else {
            System.out.println("The book is already in the library.");
        }
    }

    static void main() {
        LibrarySystem book1 = new LibrarySystem("Rich dad poor dad" , "T.Kawasaski" , 001);
        LibrarySystem book2 = new LibrarySystem("Atomic Habits" , "Unknown" , 002);
        LibrarySystem book3 = new LibrarySystem(003);
        book1.borrowBook();
        book1.returnBook();
        book2.returnBook();
        book2.borrowBook();
        book2.returnBook();
        book3.borrowBook();
        book3.returnBook();
        System.out.println("Total number of books in the liobrary is: "+ LibrarySystem.getTotalBooks());
    }

}
//Library System