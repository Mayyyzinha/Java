/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Mayara
 */

import classes.PenDrive;
public class PenDrivePrincipal {
    public static void main (String [] args){
        PenDrive pd = new PenDrive();
        pd.setMarca("Tompson");
        pd.setCapacidade(4);
        pd.setComprimento(2.5);
        pd.setLargura(1.5);
        pd.setProfundidade(2.3);
        pd.setPeso(0.92);
        pd.setPreco(50.60);
        
        System.out.println("Marca: " + pd.getMarca() + "\nCapacidade: " + pd.getCapacidade() +"\nComprimento: " + pd.getComprimento() + "\nLargura: " + pd.getLargura() + "\nProfundidade: " + pd.getProfundidade() + "Peso: " + pd.getpeso() + "\nPreco: " + pd.getPreco());
        
    }
}
