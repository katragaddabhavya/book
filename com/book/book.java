package com.book;



public class book {

    private long ISBNNumber;
    private String title;
    private String description;
    public  Author author;
    private int price;
    public book (long ISBNNumber,String title,String description,Author author,int price){
        this.ISBNNumber=ISBNNumber;
        this.title=title;
        this.description=description;
        this.price=price;
        this.author=author;
    }

    public book() {

    }

    public long getISBNNumber(){
        return ISBNNumber;
    }
    public void setISBNNumber(long ISBNNumber){

        this.ISBNNumber =ISBNNumber;
    }
    public String getTitle(){

        return title;
    }
    public void setTitle(String title){

        this.title=title;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }
    public Author getAuthor(){

        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    public void todisplay(){
        System.out.println("isbn no" +getISBNNumber());
        System.out.println("title "+getTitle());
        System.out.println("description" +getDescription());
        System.out.println("price" +getPrice());
        System.out.println(author);
    }
}
