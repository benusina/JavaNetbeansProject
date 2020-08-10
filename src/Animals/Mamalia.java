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
public class Mamalia {
    public static void main(String[] args) {
        String name = "Singa";
        String type = "Mamalia";
        int kaki = 4;
        Animal animal = new Animal(name, type, kaki);
        animal.setName();
        animal.setKaki();
        animal.setType();
    }
}
