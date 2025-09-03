/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studikasusmodul2;

/**
 *
 * @author AKHYAN
 */
// Subclass Book 
class Book extends Material {
    private String isbn;
    private int pages;

    public Book(String title, String author, String isbn, int pages) {
        super(title, author);
        this.isbn = isbn;
        this.pages = pages;
    }

    public String getIsbn() { return isbn; }
    public int getPages() { return pages; }
}
