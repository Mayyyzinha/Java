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
public class teste {
    public static void main (String[] args) {
      Scanner entrada = new Scanner(System.in);
      String opcao;
      System.out.println("Escolha a opção: \n Banana\n Maçã\n Abacaxi\n:");
      opcao=entrada.nextLine();
      switch (opcao) {
          case "Banana":
              System.out.println("Você escolheu: Banana");
              break;
          case "Maca":
              System.out.println("Você escolheu: Maca");
              break;
          case "Abacaxi":
              System.out.println("Você escolheu: Abacaxi");
              break;
          default:
              System.out.println("Opção inválida, querido!");
         }
     }
}