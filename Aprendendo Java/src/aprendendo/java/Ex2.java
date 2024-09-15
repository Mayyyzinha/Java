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
public class Ex2 {
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    //variáveis
    double VOLUME;
    int R, ALTURA;
    System.out.println("Digite o raio da circunferência da lata de óleo:");
    R = Integer.parseInt(sc.nextLine());
    System.out.println("Digite a altura:");
    ALTURA = Integer.parseInt(sc.nextLine());
    VOLUME = 3.14159*(R*R)*ALTURA;
    System.out.printf("O volume da lata de óleo é de %.2f litros.", VOLUME);
    }
}
