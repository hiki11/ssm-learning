package com.feng.pojo;


public class Books {

  private long bookId;
  private String bookName;
  private long bookCounts;
  private String detail;

  public Books() {
  }

  public Books(long bookId, String bookName, long bookCounts, String detail) {
    this.bookId = bookId;
    this.bookName = bookName;
    this.bookCounts = bookCounts;
    this.detail = detail;
  }

  public long getBookId() {
    return bookId;
  }

  public void setBookId(long bookId) {
    this.bookId = bookId;
  }


  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }


  public long getBookCounts() {
    return bookCounts;
  }

  public void setBookCounts(long bookCounts) {
    this.bookCounts = bookCounts;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

}
