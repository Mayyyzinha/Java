/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mayara
 */
//subclase sapato
import java.util.Scanner;
public class Sapato extends Cadarco {
    //atributos
    String modelo;
    
    //construtores
    public Sapato () {
    }
    public Sapato (String m, double p, int t,boolean c, String mo) {
        super(m,p,t,c);
        setModelo(mo);
    }
    public Sapato (String m, double p, int t,String mo) {
        super (m,p,t);
        setModelo(mo);
    }
    public Sapato (String m, double p, String mo) {
        super(m,p);
        setModelo(mo);
    }
    public Sapato (String mo) {
        setModelo(mo);
    }
    
    //método setter
    public void setModelo (String mo) {
        if(!mo.isEmpty()){
            modelo = mo;
        }
    }
    
    //método getter
    public String getModelo () {
        return modelo;
    }
    
    //método cadastrar
    public void cadastrarSapato(String m, double p, int t, boolean c, String mo){
        super(m,p,t,c);
        setModelo(mo);
    }
    
    //método entrada
    public void entradaDadosSapato(){
        Scanner sc = new Scanner(System.in);
        super.entradaDadosCadarco();
        System.out.println("Digite o modelo: ");
        setModelo(sc.nextLine());
    }
    
    //método imprimir
    public void imprimirSapato() {
        super.imprimirCadarco();
        System.out.println("Modelo: " + getModelo());
    }
}
