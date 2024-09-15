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

public class Quadrilatero {
    public static void main(String[] args) {
        // Área e volume de um quadrilátero
        Scanner sc = new Scanner(System.in);
        double area, volume, largura, altura, profundidade;

        System.out.println("Insira a largura:");
        largura = sc.nextDouble();

        System.out.println("Insira a altura:");
        altura = sc.nextDouble();

        System.out.println("Insira a profundidade:");
        profundidade = sc.nextDouble();

        area = largura * altura;
        volume = largura * altura * profundidade;

        System.out.println("Área: " + area);
        System.out.println("Volume: " + volume);
    }
}
