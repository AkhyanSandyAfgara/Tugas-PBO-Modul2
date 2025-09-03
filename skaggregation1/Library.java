/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.skaggregation1;

/**
 *
 * @author AKHYAN
 */
class Library {
    Material material;
    User user;

    public Library(Material material, User user) {
        this.material = material;
        this.user = user;
    }

    public void tampilkanInfo() {
        System.out.println("Library memiliki:");
        System.out.println("- Material: " + material.judul);
        System.out.println("- User: " + user.nama);
    }
}
