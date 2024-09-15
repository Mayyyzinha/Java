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
public class Ex5 {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		
		do {
			System.out.println("Digite um número inteiro:");
                        n = Integer.parseInt(sc.nextLine());
				
				if (n % 2 == 0 && n % 3 == 0) {
					System.out.println("O número " + n + " é divisível por 2 e por 3");
				}
				
				else {
					System.out.println("O número " + n + " não é divisível por 2 e por 3");
				}
			}
		
		while (n != -1);
	}
}