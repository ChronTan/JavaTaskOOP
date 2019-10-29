package com.company.bookshelf;

public class Book {

    private String name;
    private double price;
    private int qty=0;
    private Author[] authors;

    public Book(String name, double price, int qty, Author[] authors) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.authors = authors;
    }

    public Book(String name, double price, Author[] authors) {
        this.name = name;
        this.price = price;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Author[] getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        Author author=new Author();
        return "Book[" +
                "name='" + name +
                "Author["+"name= "+author.getName()+", email= "
                +author.getEmail()+
                ", gender= "+author.getGender()+
                ", price=" + price +
                ", qty=" + qty +
                ", authors=" + authors +
                "]";
    }

    public String getAuthorsNames(){
        String authorName="";
        for(int i=0;i<authors.length;i++){
            authorName+=authors[i].getName()+", ";
        }
        return authorName;
    }

    public static void main(String[] args) {

    }
}
