/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1_123220050;

/**
 *
 * @author LENOVO
 */
public class Pemain {
    String nama;
    int nomor;
    
    public Pemain(String nama, int nomor) {
        this.nama = nama;
        this.nomor = nomor;
    }
    
    public void tampil() {
        System.out.println("Nama             : " + nama);
        System.out.println("No. Punggung     : " + nomor);
    }
    
    public void bermain() {
        System.out.println("Pemain bermain di lapangan.");
    }
}