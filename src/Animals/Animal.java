/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals;

/**
 *
 * @author khusn
 */
public class Animal {
    private String nama;
    private String type;
    private int kaki;
    
    public Animal(String nama, String type, int kaki) {
        this.nama = nama;
        this.type = type;
        this.kaki = kaki;
    }
    
    public void setName() {
        System.out.println("Nama Hewan : " + this.nama);
    }
    
    public void setType() {
        System.out.println("Tipe Hewan : " + this.type);
    }
    
    public void setKaki() {
        System.out.println("Hewan ini berkaki " + this.kaki);
    }
}
