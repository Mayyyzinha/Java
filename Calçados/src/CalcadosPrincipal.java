/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mayara
 */
public class CalcadosPrincipal {
    public static void main (String[] args) {
        Chinelo c1 = new Chinelo("Ipanema", 39.90, 35, true, true);
        c1.entradaDadosChinelo();
        c1.imprimirChinelo();
        
        Tenis t1 = new Tenis("Nike", 159.90, 35, true, false);
        t1.entradaDadosTenis();
        t1.imprimirTenis();
        
        Sapato s1 = new Sapato ("Vill",300,40,false,"x");
        s1.entradaDadosSapato();
        s1.imprimirSapato();
    }
}
