/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mayara
 */
import java.util.Scanner;
public class Moto extends Veiculos {
    public static final double DESCONTO;
    int volumeBagageiro;
    
    //construtores
    public Moto () {}
    
    public Moto (int volumePassageiro, double preco, String marca, String placa)
    {
        super(preco, marca,placa);
        this.setVolumeBagageiro(volumeBagageiro);
    }
    
    public Moto (int volumeBagageiro, double preco, String marca)
    {
        super(preco, marca);
        this.setVolumeBagageiro(volumeBagageiro);
    }
    
    public Moto (int volumeBagageiro, double preco)
    {
        super(preco);
        this.setVolumeBagageiro(volumeBagageiro);
    }
    public Moto (int volumeBagageiro)
    {
        this.setVolumeBagageiro(volumeBagageiro);
    }
    
    public Moto (String marca) 
    {
        super(marca);
    }
    
    public Moto (double preco) 
    { 
        super(preco);
    }
    
    public Moto (String placa, double preco)
    {
        super(placa, preco);
    }
    
    //setters
    public void setVolumeBagageiro(int volumeBagageiro)
    {
        this.volumeBagageiro = volumeBagageiro;
    }
    
    //getters
    public int getVolumeBagageiro()
    { 
        return volumeBagageiro;
    }
    
    //métodos
    public double desconto()
    {
        getPreco() * (1 - DESCONTO);
    }
    
    public void acelerar()
    {
        moto.setRpm(getRpm() + 100);
    }
    public void desacelerar()
    {
        moto.setRpm(getRpm( - 100));
    }
    public void frear()
    {
        System.out.println("Moto freando");
    }
    public void virarDireita()
    {
        System.out.println("Moto virando a direita");
    }
    public void virarEsquerda()
    {
        System.out.println("Moto virando a esquerda");
    }
    
    //método cadastrar
    public void cadastrar (int volumeBagageiro, double preco, String marca, String placa, Motor moto, int numPassageiros)
    {
        super(preco, marca, placa, moto, numPassageiro);
        this.setVolumeBagageiro(volumeBagageiro);
    }
    
    //método entrada de dados
    public void entradaDadosMoto()
    {
        Scanner sc = new Scanner(System.in);
        super.entradaDadosVeiculo();
        
        System.out.println("Qual o volume do bagageiro da moto? ");
        setVolumeBagageiro(Integer.parseInt(sc.nextLine()));
    }
    
    // método imprimir
    public void imprimir () 
    {
        super.imprimirVeiculos;
        System.out.println("Volume do bagageiro: " + getVolumeBagageiro());
    }
}
