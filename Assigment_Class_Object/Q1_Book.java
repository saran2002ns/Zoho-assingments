package Assigment_Class_Object;

import java.util.ArrayList;
import java.util.List;

public class Q1_Book {
    private String title;
    private String author;
    private double price;
    static int bookCount;
    static List<Q1_Book> books = new ArrayList<>();  


    public Q1_Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }
    // public Q1_Book(Q1_Book book ){
    //     list.add(book);
    // }
    public static void add(Q1_Book book){
        books.add(book);
    }
    public static void display(){
        for(Q1_Book book : books){
            System.out.println(book.toString());
        }
            
    }

    public String toString(){
        return "Name : "+title+" | Author : "+ author+"  |  "+" Price : "+price;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public static void main(String[] args) {
            Q1_Book book1 = new Q1_Book("bahubali", "raju", 10000);
            Q1_Book book2 = new Q1_Book("saran", "arun", 1000000);
            book1.setAuthor("gokul");

            System.out.println(book1.getAuthor());
            System.out.println(book2.getPrice());
            add(book1);
            add(book2);
            display();
            // new Q1_Book(book1);
            // new Q1_Book(book2);
    }
}
