/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendendo.java;

/**
 *
 * @author Mayara
 */

import java.util.Scanner;
public class Ex3 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        //variáveis
        int a,b,quadrado_Diferenca,diferenca_Quadrados;
        System.out.println("Digite o primeiro numero inteiro:");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o segundo numero inteiro:");
        b = Integer.parseInt(sc.nextLine());
        quadrado_Diferenca = (a-b)*(a-b);
        diferenca_Quadrados = (a-b)*(a+b);
        System.out.printf("Quadrado da diferença entre %d e %d = %d\n", a,b,quadrado_Diferenca);
        System.out.printf("Diferença de quadrados entre %d e %d = %d\n", a,b,diferenca_Quadrados);
    }
}
