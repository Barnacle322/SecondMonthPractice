package com.company.library;

import java.util.ArrayList;
import java.util.List;

public class Department {
    protected List<Book> list = new ArrayList<Book>();

    public Department() {}

    public void addBook(Book book) {
        list.add(book);
    }

    public String listAllBooks(){
        String msg = "";
        for (Book s: list) {
            msg += s.getName() + ", ";
        }
        return msg;
    }

    public String getBookQuantity() {
        String msg = String.valueOf(list.toArray().length);
        return msg;
    }

    public String findBook(String author) {
        String match = "No matches";
        for (Book s: list) {
            if (author.equals(s.getAuthor())) {
                match = String.format("Book found. ID: %s", s.getId());
            }
        }
        return match;
    }

    public String getInfo() {
        return toString();
    }
}
