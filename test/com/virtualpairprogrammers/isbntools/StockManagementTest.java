package com.virtualpairprogrammers.isbntools;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockManagementTest {

    @Test
    public void testCanGetACorrectLocatorCode(){
        String isbn = "0140177396";
        StockManagement stockManagement = new StockManagement();
        String locatorCode = stockManagement.getLocatorCode(isbn);
        assertEquals("7396J4", locatorCode);
    }
}
