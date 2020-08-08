package com.feng.service;

import com.feng.pojo.Books;

import java.util.List;

//BookService:底下需要去实现,调用dao层
public interface BookService {
    //增加一本书
    int addBook(Books book);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books boo);

    //查询一本书
    Books queryBookById(int id);

    //查询全部的书，返回list集合
    List<Books> queryAllBook();
}
