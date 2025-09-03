/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prak2percobaan1;

/**
 *
 * @author AKHYAN
 */
class Van extends Vehicle{
    private Speed speed;
    
    public Speed getSpeed(){
        return speed;
    }
    public void setSpeed(Speed speed){
        this.speed = speed;
    }
    
    public void print(){
        System.out.println("vin: " +this.getVin() + ", Max Speed: " +speed.getMax());
    }
}