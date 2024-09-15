/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Mayara
 */
import classes.Humano;
public class HumanoPrincipal {
    public static void main (String [] args) {
        System.out.println("Criação de objetos humano:");
        Humano h1 = new Humano();
        h1.setSexo("Masculino");
        h1.setNome("Joao");
        h1.setIdade(23);
        h1.setPeso(65.4);
        h1.setAltura(1.76);
        System.out.println("Nome: " + h1.getNome() + "\nSexo: " + h1.getSexo() + "\nIdade: " + h1.getIdade() + "\nPeso: " + h1. getPeso() + "\nAltura: " + h1.getAltura());
    
    }
}
