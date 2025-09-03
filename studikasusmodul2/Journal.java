/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studikasusmodul2;

/**
 *
 * @author AKHYAN
 */
// Subclass Journal 
class Journal extends Material {
    private String issn;
    private int volume;

    public Journal(String title, String author, String issn, int volume) {
        super(title, author);
        this.issn = issn;
        this.volume = volume;
    }

    public String getIssn() { return issn; }
    public int getVolume() { return volume; }
}

