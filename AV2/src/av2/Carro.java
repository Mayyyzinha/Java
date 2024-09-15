/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package av2;

/**
 *
 * @author Mayara
 */

import java.util.Scanner;
public class Carro extends Passageiros {
    //desconto de 10% -> 0.1
    public static final double DESCONTO = 0.1;
    private int volumeMala;
    
    //construtores
    public Carro (){}
    
    public Carro (int volumeMala, double preco, String marca, String placa, int numPassageiro) 
    {
        super(preco, marca, placa, numPassageiro);
        this.setVolumeMala(volumeMala);
    }
    
    public Carro (int volumeMala, double preco, String marca, String placa)
    {
        super(preco, marca, placa);
        this.setVolumeMala(volumeMala);
    }
    
    public Carro (int volumeMala, double preco)
    {
        super(preco);
        this.setVolumeMala(volumeMala);
    }
    
    public Carro (double preco, String marca, String placa) 
    {
        super(preco, marca, placa);
    }
    
    public Carro (int volumeMala) 
    {
        this.setVolumeMala(volumeMala);
    }
    
    //setters
    public void setVolumeMala(int volumeMala) 
    {
        if (volumeMala > 0)
        {
        this.volumeMala = volumeMala;
        }
    }
    
    //getters
    public int getVolumeMala()
    {
        return this.volumeMala;
    }
    
    //métodos 
    
    public double desconto () 
    {
        return getPreco() * (1 - DESCONTO);
    }
    
    public void acelerar ()
    {
        motor.setRpm(motor.getRpm() + 100);
    }
    
    public void desacelerar ()
    {
        motor.setRpm(motor.getRpm() - 100);
    }
    
    public void frear() 
    {
        System.out.println("Carro freando");
    }
    
    public void virarDireita()
    {
        System.out.println("Carro virando a direita");
    }
    
    public void virarEsquerda()
    {
        System.out.println("Carro virando a esquerda");
    }
    
    //método cadastrar
    public void cadastrarCarro(int volumeMala, double preco, String marca, String placa, Motor motor, int numPassageiro)
    {
        super.cadastrarPassageiro(volumeMala, preco, marca, placa, motor, numPassageiro);
        setVolumeMala(volumeMala);
    }
    
    //método entrada de dados
    public void entradaDadosCarro() 
    {
    //criando objeto
        Scanner sc = new Scanner(System.in);
        
        super.entradaDadosPassageiro();
        
        System.out.println("Digite o volume da mala.: ");
        setVolumeMala(Integer.parseInt(sc.nextLine()));
    }
    
    //método imprimir
    public void imprimirCarro()
    {
        super.imprimirPassageiro();
        
        System.out.println("Volume da mala: " + getVolumeMala());
    }
}
