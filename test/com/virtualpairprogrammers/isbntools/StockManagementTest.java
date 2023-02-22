package com.virtualpairprogrammers.isbntools;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockManagementTest {

    @Test
    public void testCanGetACorrectLocatorCode(){
    //creating a Test stub. inject dependencyt into our test.
        ExternalISBNDataService testService = new ExternalISBNDataService() {
            @Override
            public Book lookup(String isbn) {
                return new Book(isbn, "Of Mice and Men", "J. Steinbeck");
            }

        };

        StockManagement stockManager = new StockManagement();
        stockManager.setService(testService);


        String isbn = "0140177396";

        String locatorCode = stockManager.getLocatorCode(isbn);
        assertEquals("7396J4", locatorCode);
    }
}
