/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mayara
 */

//superclasse
import java.util.Scanner;
public class Calçados {
    //atributos gerais
    String marca;
    double preco;
    int tamanho;
    
    //construtores
    public Calçados () {
    }
    public Calçados (String m, double p, int t) {
        setMarca(m);
        setPreco(p);
        setTamanho(t);
    }
    public Calçados (String m, double p) {
        setMarca(m);
        setPreco(p);
    }
    public Calçados (double p, int t) {
        setPreco(p);
        setTamanho(t);
    }
    public Calçados (String m, int t) {
        setMarca(m);
        setTamanho(t);
    }
    
    //métodos setters
    public void setMarca (String m) {
        if (!m.isEmpty()){
        marca = m;
        }
    }
    public void setPreco (double p) {
        if (p > 0) {
            preco = p;
        }
    }
    public void setTamanho (int t) {
        if (t > 0) {
            tamanho = t;
        }
    }
    
    //métodos getters
    public String getMarca() {
        return marca;
    }
    public double getPreco() {
        return preco;
    }
    public int getTamanho() {
        return tamanho;
    }
    
    //método cadastrar
    public void cadastrar(String m, double p, int t){
        setMarca(m);
        setPreco(p);
        setTamanho(t);
    }
    
    //método entrada
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a marca:");
        setMarca(sc.nextLine());
        System.out.println("Digite o preco:");
        setPreco(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o tamanho:");
        setTamanho(Integer.parseInt(sc.nextLine()));
    }
    
    //método imprimir
    public void imprimir(){
        System.out.println("Marca.:" + getMarca());
        System.out.println("Preco.:" + getPreco());
        System.out.println("Tamanho.:" + getTamanho());
    } 
}
