package com.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的集合类
 * 书架
 */
public class BookShelfs implements Aggregate{
    //书架上会有很多书
    private List<Book> books = new ArrayList<>();
    //书的数量
    private Integer bookCount;

    public BookShelfs(Integer bookCount) {
        this.bookCount = bookCount;
    }

    public Integer getBookCount() {
        return bookCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
    }

    public Book getBooks(Integer index) {
        return books.get(index);
    }

    //增加书
    public void appendBook(String bookName){
        books.add(new Book(bookName));
        bookCount++;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
