package com.mycompany.tgspraktikum1;


public class Main{
    public static void main(String[]args){
    Mobil mobil = new Mobil();
    mobil.merek = "BMW";
    mobil.tahun = 2025;
    System.out.println("Mobil = " + mobil.merek);
    System.out.println("Tahun = " + mobil.tahun);
    
    Motor motor = new Motor();
    motor.merek = "R15";
    motor.tahun = 2022;
    System.out.println("Motor = " + motor.merek);
    System.out.println("Tahun = " + motor.tahun); 
 }
}    