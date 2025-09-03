/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.skaggregation2;

/**
 *
 * @author AKHYAN
 */
class BorrowTransaction {
    User user;
    Material material;

    public BorrowTransaction(User user, Material material) {
        this.user = user;
        this.material = material;
    }

    public void tampilkanTransaksi() {
        System.out.println(user.nama + " meminjam " + material.judul);
    }
}
