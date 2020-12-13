package com.iterator;

public class Main {
    public static void main(String[] args) {
        BookShelfs bookShelfs = new BookShelfs(0);

        bookShelfs.appendBook("A");
        bookShelfs.appendBook("B");
        bookShelfs.appendBook("C");
        bookShelfs.appendBook("D");
        bookShelfs.appendBook("E");

        Iterator iterator = bookShelfs.iterator();

        while (iterator.hasNext()) {
            Book next = (Book)iterator.next();
            System.out.println(next.getName());
        }

    }
}
