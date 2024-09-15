/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturas_controle;

/**
 *
 * @author Mayara
 */

import java.util.Scanner;
public class Ex1 {
    public static void main (String[] args){
        //variáveis
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        n = Integer.parseInt(entrada.nextLine());
        
        if (n % 3 == 0 && n % 4 == 0){
            System.out.println("O numero " + n + " é multiplo de 3 e 4.");
        }
        else if (n%3==0){
            System.out.println("O numero " + n + " é multiplo de 3.");
        }
        else if (n%4==0){
            System.out.println("O numero " +n + " é multiplo de 4.");
        }
        else{
            System.out.println("O numero " + n + " não é multiplo nem de 3 nem de 4");
        }
    }
}
