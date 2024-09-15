/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mayara
 */

import java.util.Scanner;
public class Onibus extends Passageiros {
   public static final double DESCONTO = 0.08;
    //atributo
    private boolean banheiro;
    
    //construtores
    public Onibus () {
}
    public Onibus(boolean banheiro, double preco, String marca, String placa,int numPassageiro)
    {
        super(preco,marca, placa, banheiro);
        this.setBanheiro(banheiro);
    }
    
    public Onibus(int volumeBagageiro, double preco, String marca, String placa)
    { 
        super(preco, marca, placa);
        this.setBanheiro(banheiro);
    }
    
    public Onibus(boolean banheiro, double preco)
    {
        super(preco);
        this.setBanheiro();
    }
    
    public Onibus(String marca, String placa)
    {
        super(marca,placa);
    }
    
    public Onibus(boolean banheiro)
    {
        this.setBanheiro();
    }
    
    public Onibus(double preco, boolean banheiro)
    {
        super(preco);
        this.setBanheiro();
    }
    
    public Onibus (String marca, double preco)
    {
        super(marca, preco);
    }
    
    //setters
    public void setBanheiro(boolean banheiro)
    {
        this.banheiro = banheiro;
    }
    
    //getters
    public int getBanheiro()
    {
        return banheiro;
    }
    
    //métodos
    public double desconto ()
    {
        return getPreco() * (1 - DESCONTO);
    }
    
    public void acelerar() 
    {
        motor.getRpm(motor.setRpm() + 100);
    }
    public void desacelerar()
    {
        motor.getRpm(motor.setRpm() - 100);
    }
    public void frear()
    {
        System.out.println("Carro freando");
    }
    public void virarDireita()
    {
        System.out.println("ônibud virando a direita");
    }
    public void virarEsquerda()
    {
        System.out.println("ônibus virando a esquerda");
    }
    
    //método cadastrar
    public void cadastrar (boolean banheiro, double preco, String marca, String placa, Motor motor, int numPassageiros)
    {
        super(preco, marca, placa, motor, numPassageiro);
        this.setBanheiro(banheiro);
    }
    
    //método entrada de dados
    public void entradaDadosOnibus ()
    {
        Scanner sc = new Scanner(System.in);
        super.entradaDadosPassageiro();
        
        System.out.println("Tem banheiro? 1-SIM 2-NÃO");
        int opcao = Integer.parseInt(sc.nextLine());
        if (opcao == 1) 
        {
            setBanheiro(true);
        }
        else if (opcao == 2)
        {
            setBanheiro(false);
        }
        else
        {
            System.out.println("Opcao inválida");
        }
        
        //imprimir
        public void imprimirOnibus()
        {
            super.imprimirPassageiro();
            System.out.println("Banheiro: " + getBanheiro());
        }
    }
}