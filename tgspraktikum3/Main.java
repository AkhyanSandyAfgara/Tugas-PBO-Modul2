/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AKHYAN
 */
public class Main {
    public static void main(String[] args) {
        AkunBank akun = new AkunBank(1000);

        akun.setor(500);       // tambah saldo
        akun.tarik(200);       // tarik saldo

        System.out.println("Saldo akhir: " + akun.getSaldo());
    }
}
