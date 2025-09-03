/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AKHYAN
 */
class AkunBank {
    private double saldo; // data sensitif, disembunyikan

    // constructor
    public AkunBank(double saldoAwal) {
        saldo = saldoAwal;
    }

    // hanya bisa lihat saldo lewat getter
    public double getSaldo() {
        return saldo;
    }

    // method untuk setor
    public void setor(double jumlah) {
        saldo += jumlah;
    }

    // method untuk tarik dengan validasi
    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak cukup!");
        }
    }
}
