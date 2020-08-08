package com.feng.dao;

import com.feng.pojo.Books;

import java.awt.print.Book;
import java.util.List;

public interface BookMapper {

    //增加一本书
    int addBook(Books book);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books book);

    //查询一本书
    Books queryBookById(int id);

    //查询全部的书，返回list集合
    List<Books> queryAllBooks();

}
