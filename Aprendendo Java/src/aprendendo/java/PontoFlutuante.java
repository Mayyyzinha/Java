/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendendo.java;

/**
 *
 * @author Mayara
 */
public class PontoFlutuante {
    public static void main (String[] args) {
        double pi = 3.1415; //class WHAPPER Double
        float pi2 = 3.1415F; //class WRAPPER Float
        boolean flag = true; //class WHAPPER Boolean
        System.out.println("Flag= " + flag);
        flag = false;
        System.out.println("Flag= " + flag);
        
        String nome = "Carlos";
        System.out.println("Nome= " + nome);
        System.out.println("Tam.= " + nome.length());
        
        char l1='A', l2='\n', l3='\t', l4='\\'; //classe Wrapper character
        System.out.println("Letra a=" + l1 + "\npular linha " + l2 + "\n" + "tabulação" + l3 + "c:" + l4);
        System.out.println("C:\tabelas");
        System.out.println("C:\\tabelas");
        
        byte a =-128, a2=127; //Classe Wrapper byte
        short b=-32768, b2= 32767; // Classe Wrapper short
        int c=-214783648, c2= 2147483647; // Classe Wrapper integer
        long d=9; //Classe wrapper long
    }
    
}
