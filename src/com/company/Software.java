package com.company;

import java.util.Scanner;

public class Software extends Product {

    Scanner keyboard = new Scanner(System.in);

    public void priceOf() {

        System.out.println("Enter the price of the software");
        price = keyboard.nextInt();
    }


    public void nameOf(){

        System.out.println("Enter the name of the software");
        name=keyboard.nextLine();
        priceOf();
        descriptionOf();
        softwareShow();
    }

    public void descriptionOf(){

        System.out.println("Enter the description of the software");
        desc = keyboard.next();


    }

    public void softwareShow() {
        System.out.println("The name of the software is " + name);
        System.out.println("The description of the software is " + desc);
        System.out.println("The price of the software is " + price);
    }
}


