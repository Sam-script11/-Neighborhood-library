package com.pluralsight;

import java.awt.print.Book;
import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        BOOK b1 = new BOOK(5, "the diary", "33fft", " ", false);
        Scanner keyboard = new Scanner(System.in);
        String[] bookTitles = {"Harry potter", "the hunger games", "Junie B jones"};
        String[] isbnCollection = {"222=43", "11235-4", "4568-67"};


        BOOK[] booksList = new BOOK[3];


        for (int i = 0; i < 3; i++) {
            booksList[i] = new BOOK(i + 1, bookTitles[i], isbnCollection[i], "", false);
            System.out.println(booksList[i]);

        }
        int num1 = 0;
        while (num1 != 3) {
            System.out.print("Please select an option: \n" +
                    "show available book: 1 \n" +
                    "show checked out books: 2 \n" +
                    "Exit: 3");
            num1 = keyboard.nextInt();

            if (num1 == 1) {
                for (BOOK book : booksList) {
                    if (book.isCheckedOut()) {
                        System.out.println("unavailable: ");
                    } else {
                        System.out.println(book);

                    }
                }
            } else if (num1 == 2) {
                for (BOOK book : booksList) {
                    if (!book.isCheckedOut()) {
                        System.out.println("unavailable: ");
                    } else {
                        System.out.println(book);
                    }
                }

            }
            else{
                break;
            }
        }
    }
}