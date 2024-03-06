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
public class Striker extends Pemain {
    private int gol;
    
    public Striker(String nama, int nomor, int gol) {
        super(nama, nomor);
        this.gol = gol;
    }
    
    @Override
    public void bermain() {
        System.out.println("Striker bermain untuk mencetak gol.");
    }
    
    public void selebrasi() {
        System.out.println("Goal! Pemain berselebrasi.");
    }
    
    
    public void setGol(int gol) {
        this.gol = gol;
    }
    
    public int getGol() {
        return gol;
    }
}
