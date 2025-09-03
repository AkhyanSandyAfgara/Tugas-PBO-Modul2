/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prak2percobaan3;

/**
 *
 * @author AKHYAN
 */
class Mobil {
    private Mesin mesin;
    private Baterai baterai;
    
    public Mobil(Mesin mesin, Baterai baterai){
        this.mesin = mesin;
        this.baterai = baterai;
    }
    public void mulaiJalan(){
        System.out.println("Mobil mulai berjalan....");
        mesin.nyalakanMesin();
        baterai.cekBaterai();
    }  
}
