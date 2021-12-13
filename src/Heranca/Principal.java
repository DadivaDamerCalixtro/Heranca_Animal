/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

/**
 *
 * @author IFSC
 */
public class Principal {
     public static void main(String args[]) {
    Cachorro cachorro = new Cachorro();
    
    cachorro.setRaca("Shihtzu");
    cachorro.setPeso(5.6);
    cachorro.setComer("Carnivoro");
    cachorro.setDormir("Sim");
    cachorro.setCorrer("Sim");
    cachorro.setFamilia("Canideos/Canidae");
    cachorro.setRespirar("Obvio");
    cachorro.setMamar("Sim");
    
    System.out.println("---------MAMIFERO------------");
    System.out.println("--------CACHORRO------------");
    System.out.println("Raça: "+cachorro.getRaca());
    System.out.println("Peso: "+cachorro.getPeso()+" Kg");
    System.out.println("Tipo de alimentação: "+cachorro.getComer());
    System.out.println("Dormir: "+cachorro.getDormir());
    System.out.println("Correr: "+cachorro.getCorrer());
    System.out.println("Familia: "+cachorro.getFamilia());
    System.out.println("Respirar: "+cachorro.getRespirar());
    System.out.println("Mamar: "+cachorro.getMamar());
}
}