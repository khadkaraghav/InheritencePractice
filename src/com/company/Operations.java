package com.company;

import java.util.Scanner;

public class Operations {

    Book book = new Book();
    Software soft = new Software();

    Scanner keyboard = new Scanner(System.in);

    public void display() {

        System.out.println("Let's display Book and Software Information");
        System.out.println("1. Book");
        System.out.println("2. Software");
        System.out.println("3. Exit");
        System.out.println("Enter choice [1-2]");
    }

        public void controller() {

            display();

            int choice = keyboard.nextInt();

            switch (choice) {

                case 1: book.nameOf();
                break;

                case 2: soft.nameOf();
                break;

                case 3: System.exit(0);

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }




