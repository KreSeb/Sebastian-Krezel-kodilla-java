package Collection02;

import java.util.LinkedList;

public class BookCollection {
    public static void main(String[] args) {

        LinkedList<Book> library = new LinkedList<Book>();

        Book book1 = new Book("Satanic versets", 1992);
        Book book2 = new Book("Matrix, Revolution", 2001);
        Book book3 = new Book("Krzyżacy", 2019);
        Book book4 = new Book("Pan Tadeusz", 1977);
        Book book5 = new Book("Clean Programing", 2011);
        Book book6 = new Book("Ender's Game", 2000);

        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        library.add(book6);

        for (Book books : library) {
            if (books.issueDate > 2000) {

                System.out.println("Tytuł książki: " + books.title + ", rok wydania: " + books.issueDate);
            }
        }
    }
}