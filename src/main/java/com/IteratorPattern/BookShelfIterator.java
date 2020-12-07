package com.IteratorPattern;

import java.util.List;

public class BookShelfIterator implements Iterator {
    private BookShelfs bookShelfs;
    //当前下标
    private Integer index;

    public BookShelfIterator(BookShelfs bookShelfs) {
        this.bookShelfs = bookShelfs;
        this.index = 0;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
    @Override
    public boolean hasNext() {
        if (index<bookShelfs.getBookCount()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Book books = bookShelfs.getBooks(index);
        index++;
        return books;
    }

}
