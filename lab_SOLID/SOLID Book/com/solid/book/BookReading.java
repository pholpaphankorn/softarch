package com.solid.book;
import java.util.List;

public class BookReading {
    private PageInterface page;
    public BookReading(String title, List<String> pages) {
        this.page= new Book(title,pages);
    }
    public void printToScreen() {
        do {
            System.out.println(page.getCurrentPage());
        } while (page.turnToNextPage());
    }
}
