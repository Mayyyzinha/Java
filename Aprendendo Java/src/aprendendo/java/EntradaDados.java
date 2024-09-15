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

public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variáveis
        String matricula, nome;
        double nota1, nota2;
        int idade;
        
        System.out.println("Entre com a matrícula....:");
        matricula = sc.nextLine();
        System.out.println("Entre com o nome....:");
        nome = sc.nextLine();
        System.out.println("Entre com a Nota A1....:");
        nota1 = Double.parseDouble(sc.nextLine());
        System.out.println("Entre com a Nota A2....:");
        nota2 = Double.parseDouble(sc.nextLine());
        System.out.println("Entre com a idade....:");
        idade = Integer.parseInt(sc.nextLine());
        
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Idade: " + idade);
        System.out.println("Média: " + ((nota1 + nota2) / 2));

        // Aguardar a entrada do usuário antes de encerrar
        System.out.println("Pressione Enter para sair.");
        sc.nextLine();
    }
}
