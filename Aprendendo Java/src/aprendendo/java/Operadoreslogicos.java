/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendendo.java;

/**
 *
 * @author Mayara
 */
public class Operadoreslogicos {
    public static void main (String [] args) {
        byte a=75,b=47,c=118,d=82;
        byte e,f,g;
        e=(byte) (a | b & c);
        f=(byte) (a ^ b | d & c);
        g=(byte) (a & b ^ c | d ^ e & f);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        
    }
}
