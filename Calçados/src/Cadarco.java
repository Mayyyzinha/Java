/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mayara
 */

//superclasse de tênis e sapato
import java.util.Scanner;
public class Cadarco extends Calçados {
    //atributo
    boolean cadarco;
    
    //construtor
    public Cadarco () {
    }
    public Cadarco (String m, double p, int t, boolean c){
        super(m,p,t);
        setCadarco(c);
    }
    public Cadarco (String m, double p, int t){
        super (m,p,t);
    }
    public Cadarco (String m, double p, boolean c){
        super(m,p);
        setCadarco(c);
    }
    public Cadarco (boolean c){
        setCadarco(c);
    }
    
    //método setter
    public void setCadarco (boolean c) {
        cadarco = c;
    }
    
    //método getter
    public boolean getCadarco() {
        return cadarco;
    }
    
    //método cadastrar
    public void cadastrar(String m, double p, int t, boolean c){
        super(m,p,t);
        setCadarco(c);
    }
    
    //método entrada
    public void entradaDadosCadarco(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Tem cadarco? 1-SIM 2-NÃO ");
        int opcao = Integer.parseInt(sc.nextLine());
        if (opcao == 1) {
            setCadarco(true);
        }
        else {
            setCadarco(false);
        }
    }
    
    //método imprimir
    public void imprimirCadarco() {
        super.imprimir();
        System.out.println("Cadarco: " + getCadarco());
    }
}
