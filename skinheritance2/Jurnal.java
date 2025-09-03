/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.skinheritance2;

/**
 *
 * @author AKHYAN
 */
class Journal extends Material {
    public Journal(String judul) {
        super(judul);
    }

    public void review() {
        System.out.println(judul + " adalah jurnal yang sedang direview.");
    }
}