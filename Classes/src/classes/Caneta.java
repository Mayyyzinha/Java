/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Mayara
 */
public class Caneta {
    //variáveis
    String cor;
    double preco;
    int quantidade;
    String tipo;
    
    public void setCor(String c){
        cor=c;
    }
    public void setPreco(double p){
        preco=p;
    }
    public void setQuantidade(int q){
        quantidade = q;
    }
    public void setTipo(String t){
        tipo=t;
    }
    public String getCor(){
        return cor;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public String getTipo(){
        return tipo;
    }
}
