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
public class Defender extends Pemain {
    private int tekel;
    
    public Defender(String nama, int nomor, int tekel) {
        super(nama, nomor);
        this.tekel = tekel;
    }
    
    @Override
    public void bermain() {
        System.out.println("Defender bermain untuk mentekel lawan.");
    }
    
    public void mentekel() {
        System.out.println("Tekel bersih dari pemain!");
    }
    
    public void setTekel(int tekel) {
        this.tekel = tekel;
    }
    
    public int getTekel() {
        return tekel;
    }
}
