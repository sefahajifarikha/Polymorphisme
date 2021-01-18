/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismhewan;

/**
 *
 * @author sefahaji
 */
public class Main {

    public static void main(String[] args) {
       Hewan HEWAN=new Hewan();
        TurunanKuda KUDA=new TurunanKuda();
        TurunanKucing KUCING=new TurunanKucing();
        TurunanAyam AYAM=new TurunanAyam();
        
        HEWAN.suara();
        
        HEWAN = KUDA;
        HEWAN.suara();
        
        HEWAN = KUCING;
        HEWAN.suara();
        
        HEWAN = AYAM;
        HEWAN.suara();
    }
    
}
