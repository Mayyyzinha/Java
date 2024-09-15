/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package av2;

/**
 *
 * @author Mayara
 */

//superclasse
import java.util.Scanner;
public abstract class Veiculos implements Movimentos {
    //atributos
    private double preco;
    String marca;
    private String placa;
    public static final int IDADE_MIN_MOTORISTA = 18;
    
    //criando o objeto da classe de agregação
    Motor motor = new Motor();
    
    //construtores
    public Veiculos(){}
    
    public Veiculos (double preco, String marca, String placa) 
    {
        this.setPreco(preco);
        this.setMarca(marca);
        this.setPlaca(placa);
    }
    
    public Veiculos (double preco, String marca) 
    {
        this.setPreco(preco);
        this.setMarca(marca);
    }
    
    public Veiculos (String placa, double preco) 
    {
        this.setPlaca(placa);
        this.setPreco(preco);
    }
    
    public Veiculos (String marca) 
    {
        this.setMarca(marca);
    }
    
    public Veiculos (double preco)
    {
        this.setPreco(preco);
    }
    public Veiculos (String placa, double preco, String marca) {
        this.setPlaca(placa);
        this.setPreco(preco);
        this.setMarca(marca);
    }
    
    //setters
    public void setPreco(double preco) 
    {
        if (preco > 0)
        { 
            this.preco = preco;
        }
    }
    
    public void setMarca (String marca) 
    {
        if (!marca.isEmpty())
        {
            this.marca = marca;
        }
    }
    
    public void setPlaca (String placa) 
    {
        
        if(!placa.isEmpty())
        { 
            this.placa = placa;
        }
    }
    
    //getters
    public double getPreco() 
    {
        return this.preco;
    }
    
    public String getMarca() 
    {
        return this.marca;
    }
    
    public String getPlaca()
    {
        return this.placa;
    }
    
    //método cadastrar
    public void cadastrarVeiculo(double preco, String marca, String placa, Motor motor)
    {
        this.setPreco(preco);
        this.setMarca(marca);
        this.setPlaca(placa);
        this.motor = motor;
    }
    
    //método entrada de dados
    public void entradaDadosVeiculo() 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite o preco do veiculo.:" );
        setPreco(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a marca do veiculo.:" );
        setMarca(sc.nextLine());
        System.out.println("Digite o número da placa do veiculo.:");
        setPlaca(sc.nextLine());
        motor.entradaDadosMotor();
    }
    
    //método imprimir
    public void imprimirVeiculo()
    {
        System.out.println("Preco: R$" + getPreco());
        System.out.println("Marca: " + getMarca());
        System.out.println("Placa: " + getPlaca());
        motor.imprimirMotor();
    }
    
    public abstract double desconto();
    //aqui só foi definida a assinatura do método. A implementação será nas subclasses que vão herdar
}
    