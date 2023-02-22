package com.virtualpairprogrammers.isbntools;

public interface ExternalISBNDataService {
    //this interface is responsible to call a third party system. It has a single methods
    //that returns the details of the item we are looking for of type Book

    public Book lookup(String isbn);
}
