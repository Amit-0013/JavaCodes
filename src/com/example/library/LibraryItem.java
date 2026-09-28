//Start with a base class LibraryItem that includes common
//attributes like itemID, title, and author, and methods like
//checkout() and returnItem(). Create subclasses such as Book,
//Magazine, and DVD, each inheriting from LibraryItem. Add unique
//attributes to each subclass, like ISBN for Book, issueNumber for
//Magazine, and duration for DVD.
package com.example.library;

public class LibraryItem {
    protected int itemID;
    protected String title;
    protected String author;

    public void checkout(){
        System.out.println("Thanks for borrowing the item!");
    }
    public void returnItem(){
        System.out.println("Thanks for returning the item!");
    }

}
