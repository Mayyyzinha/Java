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
public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //variáveis
        double preco,taxa_Conversao,preco_Convertido;
        System.out.println("Digite o preço do produto em real:");
        preco = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a taxa de conversão para o dolar:");
        taxa_Conversao = Double.parseDouble(sc.nextLine());
        preco_Convertido = preco * taxa_Conversao;
        System.out.printf("Preço em real: R$%.2f\n",preco);
        System.out.printf("Preço em dolar: $%.2f\n",preco_Convertido);
    }
}
