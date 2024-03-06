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
public class Tugas1_123220050 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Striker striker = new Striker("Lionel Messi", 10, 0);
        Defender defender = new Defender("Van Dijk", 4, 0);
        
        // info striker
        System.out.println("Info Striker");
        striker.tampil();
        System.out.println("Jumlah gol awal  : " + striker.getGol());
        striker.bermain();
        striker.selebrasi();
        striker.setGol(2);
        System.out.println("Jumlah gol akhir : " + striker.getGol());
        System.out.println();
        
        // info defender
        System.out.println("Info Defender");
        defender.tampil();
        System.out.println("Tekel awal       : " + defender.getTekel());
        defender.bermain();
        defender.mentekel();
        defender.setTekel(5);
        System.out.println("Tekel akhir      : " + defender.getTekel());
    }
    
}
