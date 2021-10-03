package com.solid.book;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class BookPublishing {
    private TitleInterface title;
    private PageInterface page;

    public BookPublishing(String title, List<String> pages) {
        this.title= new Book(title,pages);
        this.page= new Book(title,pages);
    }
    public void printToFile() {

        boolean isEven = false;
        String previousPage = "";
        try {
            FileWriter fileWriter = new FileWriter(title.getTitle() + ".txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            do {
                if (isEven) {
                    previousPage = page.getCurrentPage();
                    isEven = false;
                } else {
                    printWriter.printf("%-25s : %25s%n", previousPage, page.getCurrentPage());
                    isEven = true;
                }
            } while (page.turnToNextPage());
            printWriter.close();
        } catch (IOException ex) {
            System.out.println("Cannot print this book due to IOException");
        }
    }
}
