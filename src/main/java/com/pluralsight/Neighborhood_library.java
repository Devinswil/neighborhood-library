package com.pluralsight;

import java.util.Scanner;

public class Neighborhood_library {
    private static Book[] Books = new Book[20];
    private static int numbook = 20;

    public static void main(String[] args) {

        Books[0] = new Book(1823, "978-3-16-148410-0", "The Great Gatsby", true, "Alex");
        Books[1] = new Book(7495, "978-0-06-112008-4", "To Kill a Mockingbird", false, "Jim");
        Books[2] = new Book(0367, "978-0-452-28423-4", "1984", true, "Jasmyn");
        Books[3] = new Book(5142, "978-0-7432-7356-5", "The Catcher in the Rye", false, "n/a");
        Books[4] = new Book(8921, "978-0-14-243723-0", "Pride and Prejudice", true, "Madden");
        Books[5] = new Book(4673, "978-1-5011-9805-4", "The Fault in Our Stars", false, "n/a");
        Books[6] = new Book(2058, "978-0-06-231500-7", "The Alchemist", true, "Steve");
        Books[7] = new Book(3846, "978-1-4000-3342-4", "The Kite Runner", false, "n/a");
        Books[8] = new Book(7319, "978-0-7432-7357-2", "Brave New World", false, "n/a");
        Books[9] = new Book(6294, "978-1-4767-3720-2", "The Book Thief", true, "John");
        Books[10] = new Book(6581, "978-0-553-21311-7", "The Hobbit", false, "n/a");
        Books[11] = new Book(9027, "978-0-316-76948-0", "Life of Pi", false, "n/a");
        Books[12] = new Book(1730, "978-0-14-312856-1", "Where the Crawdads Sing", false, "n/a");
        Books[13] = new Book(5468, "978-0-14-028329-7", "Animal Farm", true, "Steve");
        Books[14] = new Book(3185, "978-1-250-11450-2", "The Night Circus", true, "Adam");
        Books[15] = new Book(0722, "978-0-06-205971-3", "The Road", false, "n/a");
        Books[16] = new Book(9853, "978-0-14-312854-7", "Little Fires Everywhere", false, "n/a");
        Books[17] = new Book(4320, "978-0-06-229700-5", "The Seven Husbands of Evelyn Hugo", false, "n/a");
        Books[18] = new Book(2674, "978-1-5011-8385-8", "The Vanishing Half", false, "n/a");
        Books[19] = new Book(1509, "978-0-06-245773-8", "A Man Called Ove", false, "n/a");


        Scanner myscan = new Scanner(System.in);
        while (true) {
            System.out.println("Neighborhood Library Store Home Screen");
            System.out.println("What is your Name?");
            String name = myscan.nextLine();
            System.out.println("1: Show Available Books");
            System.out.println("2: Show Checked Out Books");
            System.out.println("3: Exit");

            int selection = myscan.nextInt();
            myscan.nextLine();

            switch (selection) {
                case 1:
                    showAvailableBooks(myscan, name);
                    break;
                case 2:
                    showCheckedOutBooks();
                    break;
                case 3:
                    System.out.println("See Ya!");
                    return;

            }
        }

    }

    private static void showCheckedOutBooks() {
        System.out.println("Checked Out Books: ");
        for
        (int i = 0; i < numbook; i++) {
       if (Books[i].isCheckedOut());
       for(Book book:Books){}
            System.out.println();
        }
    }


    private static boolean showAvailableBooks(Scanner myscan, String name) {
        System.out.println("Available Books: ");
        for (Book book : Books) {
            if (!book.isCheckedOut())
                System.out.println("Id: " + book.getId() + " ISBN: " + book.getIsbn() + " Title: " + book.getTitle());
        }
        System.out.println("Would you like to check out out a book?");
        String answer = myscan.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("What is the Id of the book?");
            int bookT = myscan.nextInt();
            {
                myscan.nextInt();
            }

            boolean found = false;
            for (Book book : Books) {
                if (book.getId() == (bookT)) {
                    found = true;
                    book.setCheckedOut(true);
                    book.setCheckedOutTo(name);
                    System.out.println(name + " has checked out " + book.getTitle());
                    return true;
                }
            }


        }
        return false;

    }


}








