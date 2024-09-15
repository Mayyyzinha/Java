/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Mayara
 */
public class PenDrive {
    String marca;
    int capacidade;
    double comprimento;
    double largura;
    double profundidade;
    double peso;
    double preco;
    
    //métodos de acesso de cada atributo
    public String getMarca(){
        return marca;
    }
    public void setMarca(String m){
        if(!m.isEmpty()){
        marca=m;
        }
    }
    public void setMarca(){
        marca="";
    }
      public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int c){
        if(c>0){
            capacidade=c;
        }
    }
    public void setCapacidade(){
        capacidade=0;
    }
    public double getComprimento(){
        return comprimento;
    }
    public void setComprimento(double c){
        if(c>0){
        comprimento=c;
        }
    }
    public void setComprimento(){
        comprimento=0;
    }
     public double getLargura(){
        return largura;
    }
    public void setLargura(double l){
        if (l > 0){
        largura=l;
        }
    }
    public void setLargura(){
        largura=0;
    }
     public double getProfundidade(){
        return profundidade;
    }
    public void setProfundidade(double p){
        if (p>0){
        profundidade=p;
        }
    }
    public void setProfundidade(){
        profundidade = 0;
    }
    public double getpeso(){
        return peso;
    }
    public void setPeso(double p){
        if(p>0){
        peso=p;
        }
    }
    public void setPeso(){
        peso=0;
    }
        public double getPreco(){
        return preco;
    }
    public void setPreco(double p){
        if(p>0){
        preco=p;
        }
    }
    public void setpreco(){
        preco=0;
    }
}
