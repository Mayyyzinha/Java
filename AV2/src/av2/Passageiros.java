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
public abstract class Passageiros extends Veiculos {
    //atributo
    private int numPassageiros;
    
    //construtores
    public Passageiros () {}
    
    public Passageiros (int numPassageiros, double preco, String marca, String placa)
    {
        this.setNumPassageiros(numPassageiros);
        super(preco, marca, placa);
    }
    
    public Passageiros (int numPassageiros, double preco, String Marca)
    {
        this.setNumPassageiros(numPassageiros);
        super(preco, marca);
    }
    
    public Passageiros (int numPassageiros, double preco) 
    {
        this.setNumPassageiros(numPassageiros);
        super(preco);
    }
    
    public Passageiros (int numPassageiros, String Marca) 
    {
        this.setNumPassageiros(numPassageiros);
        super(marca);
    }
    
    public Passageiros (String placa) 
    {
        super(placa);
    }
    
    //setters
    private void setNumPassageiros (int numPassageiros) 
    {
        if (numPassageiros > 0.0)
        {
            this.numPassageiros = numPassageiros;
        }
    }
    
    //getters
    public int getNumPassageiros () 
    {
        return this.numPassageiros;
    }
    
    //método cadastrar
    public void cadastrarPassageiro (double preco, String marca, String placa, Motor motor, int numPassageiros)
    {
        super.cadastrarVeiculo(preco, marca, placa, motor);
        this.setNumPassageiros(numPassageiros);
    }
    
    //método entrada de dados 
    public void entradaDadosPassageiro () {
        //criando objeto
        Scanner sc = new Scanner (System.in);
        
        super.entradaDadosVeiculo();
        System.out.println("Digite o número de passageiros do veiculo.:" );
        setNumPassageiro(Integer.parseInt(sc.nextLine()));
    }
    
    //método imprimir
    public void imprimirPassageiro () 
    { 
        super.imprimirVeiculo();
        System.out.println("Número de passageiros: " + getNumPassageiro());
    }

}
