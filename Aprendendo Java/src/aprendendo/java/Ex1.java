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
public class Ex1 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        //variáveis
        int tempo;
        double velocidade,distancia, litros_Usados;
        System.out.println("Digite o tempo gasto na viagem [hs]");
        tempo = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a velocidade média [KM/H]");
        velocidade = Double.parseDouble(sc.nextLine());
        distancia = tempo*velocidade;
        litros_Usados = distancia/12;
        System.out.printf("%s%.2f KM\n", "Distancia: ", distancia);
        System.out.printf("%s%.2f litros\n", "Litros usados: ", litros_Usados);
    }
}
