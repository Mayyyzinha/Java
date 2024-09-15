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
public class Ex2 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        //variáveis
        int idade;
        String categoria = "";
        
        System.out.println("Por gentileza, digite a sua idade:");
        idade=Integer.parseInt(entrada.nextLine());
        
        if (idade <= 10){
             categoria= "MIRIM";
        }
        else if (idade>10 && idade<=18){
            categoria= "JUVENIL";
        }
        else if (idade>18 && idade<=40) {
            categoria= "ADULTO";
        }
        else if (idade > 40) {
            categoria= "MASTER";
        }
  
        System.out.println("Idade informada: " + idade + "\nCategoria: " + categoria);
    }
  }

