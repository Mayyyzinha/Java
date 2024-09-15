/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mayara
 */

//subclasse chinelo
import java.util.Scanner;
public class Chinelo extends Calçados {
    //atributos
    boolean acessorio;
    boolean tiras;
    
    //métodos construtores
    public Chinelo (){
    }
    public Chinelo (String m, double p, int t,boolean a, boolean ti) {
        super(m,p,t);
        setAcessorio(a);
        setTiras(ti);
    }
    public Chinelo (String m, double p, boolean a, boolean ti) {
        super(m,p);
        setAcessorio(a);
        setTiras(ti);
    }
    public Chinelo (double p, int t, boolean a, boolean ti) {
        super(p,t);
        setAcessorio(a);
        setTiras(ti);
    }
    public Chinelo (String m, int t, boolean a, boolean ti) {
        super(m,t);
        setAcessorio(a);
        setTiras(ti);
    }
    
    //métodos setters
    public void setAcessorio (boolean a) {
        acessorio = a;
    }
    public void setTiras(boolean ti) {
        tiras = ti;
    }
    
    //métodos getters
    public boolean getAcessorio() {
        return acessorio;
    }
    public boolean getTiras() {
        return tiras;
    }
    
    //método cadastrar
    public void cadastrarChinelo(boolean a, boolean ti) {
        setAcessorio(a);
        setTiras(ti);
    }
    
    //método entrada
    public void entradaDadosChinelo() {
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("O chinelo tem acessórios? 1- SIM 2- NÂO ");
        int opcao = Integer.parseInt(sc.nextLine());
        if (opcao == 1){
            setAcessorio(true);
        }
        else {
            setAcessorio(false);
        }
        System.out.println("O chinelo possui tiras? 1- SIM 2- NÃO ");
        int opcao2 = Integer.parseInt(sc.nextLine());
        if (opcao2 == 1){
            setTiras(true);
        }
        else {
            setTiras(false);
        }
    }
        
        //método imprimir
        public void imprimirChinelo() {
            super.imprimir();
            System.out.println("Acessórios: " + getAcessorio());
            System.out.println("Tiras: " + getTiras());
        }
}
    
    
    
    
    
    
    
    
    
