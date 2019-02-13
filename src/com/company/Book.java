package com.company;

import java.util.Scanner;

public class Book extends Product {

    Scanner keyboard = new Scanner(System.in);

    public void priceOf() {

        System.out.println("Enter the price of the book");
        price = keyboard.nextInt();

    }


    public void nameOf() {

        System.out.println("Enter the name of the book");
        name = keyboard.nextLine();
        descriptionOf();
        priceOf();
        bookShow();

    }

    public void descriptionOf() {

        System.out.println("Enter the author of the book");
        author = keyboard.next();
    }

    public void bookShow() {
        System.out.println("The name of the book is " + name);
        System.out.println("The author of the book is " + author);
        System.out.println("The price of the book is " + price);
    }
}