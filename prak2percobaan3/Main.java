/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prak2percobaan3;

/**
 *
 * @author AKHYAN
 */
public class Main {
    public static void main(String[]args){
        Mesin mesin = new Mesin("Mesin v8");
        Baterai baterai = new Baterai("Baterai Lithium-ion");
        
        Mobil mobil = new Mobil(mesin, baterai);
        
        mobil.mulaiJalan();
    }
}
