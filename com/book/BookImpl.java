package com.book;


public class BookImpl {
    public static void main(String[] args){
        book Book=new book();
        Author author=new Author("bhavya","bingo");
        Book.setISBNNumber(108);
        Book.setAuthor(author);
        Book.setDescription("stories");
        Book.setTitle("the ganesha");
        Book.setPrice(300);
        Book.todisplay();
    }
}
