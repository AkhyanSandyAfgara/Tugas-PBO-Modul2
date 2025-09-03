/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak1percobaan1.newpackage;

/**
 *
 * @author AKHYAN
 */
class Programmer extends Employee{
    int bonus= 10000;
    
    public static void main(String[]args){
            Programmer p=new Programmer();
    System.out.println("Programmer salary is: "+p.salary);
    System.out.println("Programmer bonus is: "+p.bonus);
    }
}