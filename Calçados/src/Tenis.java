/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mayara
 */

//subclasse tenis
import java.util.Scanner;
public class Tenis extends Cadarco {
    //atributos
    boolean esportivo;
    
    //construtores
    public Tenis (){
    }
    public Tenis (String m, double p, int t, boolean c, boolean e) {
        super(m,p,t);
        setCadarco(c);
        setEsportivo(e);
    }
    public Tenis (String m, double p, boolean e) {
        super(m,p);
        setCadarco(c);
        setEsportivo(e);
    }
    public Tenis (double p, int t, boolean c, boolean e) {
        super (p,t);
        setCadarco(c);
        setEsportivo(e);
    }
    public Tenis (String m, int t, boolean c, boolean e) {
        super(m,t);
        setCadarco(c);
        setEsportivo(e);
    }
    public Tenis (String m, double p, int t, boolean c ) {
        super(m,p,t);
        setCadarco(c);
    }
    public Tenis (String m, double p, int t) {
        super(m,p,t);
    }
    public Tenis (boolean c, boolean e) {
        setCadarco(c);
        setEsportivo(e);
    }
    
    //métodos setters
    public void setCadarco(boolean c) {
        cadarco = c;
    }
    public void setEsportivo(boolean e) {
        esportivo = e;
    }
    
    //métodos getters
    public boolean getCadarco() {
        return cadarco;
    }
    public boolean getEsportivo() {
        return esportivo;
    }
    
    //método cadastrar
    public void cadastrarTenis(boolean c, boolean e) {
        setCadarco(c);
        setEsportivo(e);
    }
    
    //método entrada
    public void entradaDadosTenis () {
        Scanner sc = new Scanner (System.in);
        super.entradaDadosCadarco();
        System.out.println("É esportivo? 1-SIM 2-NÃO ");
        int opcao = Integer.parseInt(sc.nextLine());
        if (opcao == 1){
            setEsportivo(true);
        }
        else {
            setEsportivo(false);
        }
    }
    
    //método imprimir
    public void imprimirTenis() {
        super.imprimirCadarco();
        System.out.println("Esportivo: " + getEsportivo());   
    }
}
