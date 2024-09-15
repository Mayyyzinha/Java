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

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;

        System.out.println("Insira o valor do mês:");
        mes = Integer.parseInt(sc.nextLine());

        switch(mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("O mês " + mes + " tem 31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("O mês " + mes + " tem 30 dias");
                break;
            case 2:
                System.out.println("O mês " + mes + " tem 28 dias\n[quando é bissexto tem 29 dias]");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}

		
