package com.book;

public class Author {
    private String authorName;
    private String authorPenName;


    public Author(String authorName, String authorPenName) {
        this.authorName = authorName;
        this.authorPenName = authorPenName;

    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getAuthorPenName() {
        return authorPenName;
    }

    public void setAuthorPenName(String AuthorPenName) {
        this.authorPenName = AuthorPenName;
    }


    public String toString() {
        return "Author {" + "authorName: "+getAuthorName()+" authorPenName "+getAuthorPenName()+"}" ;
    }
}


