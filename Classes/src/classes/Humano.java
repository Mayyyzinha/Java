/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Mayara
 */
public class Humano { //declaração da classe
    //atributos
    String nome; 
    String sexo; 
    int idade; 
    double peso, altura; 
    public void setNome(String n){ //método para atribuir o nome
        nome = n; // n é uma variável de apoio (parãmetro), não é uma atributo de classe
    }
    public void setSexo(String s){
        sexo=s;
    }
    public void setIdade(int i){
        idade=i;
    }
    public void setPeso(double p){
        peso=p;
    }
    public void setAltura(double a){
        altura=a;
    }
    public String getNome(){ //método para recuperar o nome
        return nome;
    }
    public String getSexo(){
        return sexo;
    }
    public int getIdade(){
        return idade;
    }
    public double getPeso(){
        return peso;
    }
    public double getAltura(){
        return altura;
    }
}
