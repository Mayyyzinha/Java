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

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.println("Digite o primeiro número inteiro:");
        n1 = Integer.parseInt(sc.nextLine());
        
        System.out.println("Digite o segundo número inteiro: [esse tem que ser "
        + "menor "+ "que o primeiro]");
        n2 = Integer.parseInt(sc.nextLine());

        if (n1 > n2) {
            System.out.println("Números pares entre " + n2 + " e " + n1 + ":");
            for (int i = n2; i <= n1; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

        
        
