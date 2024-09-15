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
public class Ex5 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		//variáveis
		int cod_Vend, tot_Vendas;
		double sal_Fixo, perc_Vendas, sal_Total;
		
		System.out.println("Insira o número do vendedor:");
		cod_Vend = Integer.parseInt(sc.nextLine());
		System.out.println("insira o salário fixo:");
		sal_Fixo = Double.parseDouble(sc.nextLine());
		System.out.println("Insira o total de vendas:");
		tot_Vendas = Integer.parseInt(sc.nextLine());
		System.out.println("Insira o percentual adicionado pelo total de vendas:");
		perc_Vendas = Double.parseDouble(sc.nextLine());
		
		//cálculo do salário total do vendedor
		sal_Total = sal_Fixo + (tot_Vendas*perc_Vendas);
		
		System.out.println("Número do vendedor: " + cod_Vend);
		System.out.printf("Salário total: %.2f", sal_Total);
	}
}
