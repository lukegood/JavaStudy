package com.all.other;

import java.io.Serializable;

public class Book implements Comparable<Book>, Serializable {
    private String title;
    private double price;

    public Book(){
        System.out.println("No Parameter!");
    }

    public Book(String title, double price){
        this.title = title;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Book)){
            return false;
        }
        Book temp = (Book)obj;
        if(this.title.equals(temp.title) && this.price == temp.price){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Book o){
        if(this.price > o.price){
            return 1;
        }
        else if(this.price < o.price){
            return -1;
        }
        else{
            return this.title.compareTo(o.title);
        }
    }

    @Override
    public String toString(){
        return "Book Name:" + this.title + ", Price:" + this.price + "\n";
    }

//    public String toString(){
//        return "Book Name!";
//    }
    public void printInfo(){
        System.out.println(this.price);
    }
}
