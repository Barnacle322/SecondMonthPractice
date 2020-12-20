package com.company;

import com.company.library.Book;
import com.company.library.Fiction;
import com.company.library.Legal;
import com.company.library.Technical;

public class Main {

    public static void main(String[] args) {
	    Book orientExpress = new Book(123456, "Agatha Christie", "Murder on the Orient Express", "January 1, 1934");
	    Book warpeace = new Book(53525, "Leo Tolstoy", "War and Peace", "1867");

	    Book mercy = new Book(45261, "Bryan Stevenson", "Just Mercy: A Story of Justice and Redemption", "October 21, 2014");
//	    Book incarcernation = new Book(16723, "Michelle  Alexander", "The New Jim Crow: Mass Incarceration in the Age of Colorblindness", "January 5, 2010");

	    Book programmer = new Book(521532, "Cory Althoff", "The Self-Taught Programmer: The Definitive Guide to Programming Professionally", "January 24th 2017");
	    Book shapeUp = new Book(42344, "Ryan Singer", "Shape Up: Stop Running in Circles and Ship Work that Matters", "unknown");

	    Fiction fiction = new Fiction();
	    Legal legal = new Legal();
	    Technical technical = new Technical(true);

	    fiction.addBook(orientExpress);
        fiction.addBook(warpeace); // Добавление книг
        System.out.println(fiction); // Вывод информации
        System.out.println(fiction.getInfo()); // Вывод информации
        System.out.println("Book list:  " + fiction.listAllBooks()); // Вывод всех книг, а именно названий
        System.out.println(fiction.getBookQuantity()); // Вывод количества книг
        System.out.println(fiction.findBook("Agatha Christie")); // Поиск по автору

        System.out.println("");

        legal.addBook(mercy);
//        legal.addBook(incarcernation);
        System.out.println(legal);
        System.out.println("Book list:  " + legal.listAllBooks());
        System.out.println(legal.getBookQuantity());
        System.out.println(legal.findBook("Barack Obama"));

        System.out.println("");

        technical.addBook(programmer);
        technical.addBook(shapeUp);
        System.out.println(technical);
        System.out.println("Book list: " + technical.listAllBooks());
        System.out.println(technical.getBookQuantity());
        System.out.println(technical.findBook("Ryan Singer"));





    }
}
