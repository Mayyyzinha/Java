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
public class Motor {
    //atributos
    private int potencia, rpm;
    private String tipoCombustivel;
    
    // construtores
    public Motor () {}
    
    public Motor (int potencia, int rpm, String tipoCombustivel) {
        this.setPotencia(potencia);
        this.setRpm(rpm);
        this.setTipoCombustivel(tipoCombustivel);
    }
    
    public Motor (int potencia, int rpm) 
    {
        this.setPotencia(potencia);
        this.setRpm(rpm);
    }
        
    public Motor (int potencia, String tipoCombustivel)
    {
        this.setPotencia(potencia);
        this.setTipoCombustivel(tipoCombustivel);
    }
    
    public Motor (String tipoCombustivel, int rpm) 
    {
        this.setTipoCombustivel(tipoCombustivel);
        this.setRpm(rpm);
    }
    
    //setters
    public void setPotencia (int potencia) 
    {
        if (potencia > 0) {
        this.potencia = potencia;
        }
    }
    
    public void setRpm (int rpm) 
    {
        if (rpm > 0) {
        this.rpm = rpm;
        }
    }
    
    public void setTipoCombustivel (String tipoCombustivel) 
    {
        if (!tipoCombustivel.isEmpty()){
        this.tipoCombustivel = tipoCombustivel;
        }
    }
    
    //getters
    public int getPotencia () 
    {
        return this.potencia;
    }
    
    public int getRpm () 
    {
        return this.rpm;
    }
    
    public String getTipoCombustivel () 
    {
        return this.tipoCombustivel;
    }
    
    //método cadastrar
    public void cadastrarMotor(int potencia, int rpm, String tipoCombustivel) 
    {
        this.setPotencia(potencia);
        this.setRpm(rpm);
        this.setTipoCombustivel(tipoCombustivel);
    }
    
    //método entrada de dados
    public void entradaDadosMotor() 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite a potencia do motor.: ");
        setPotencia(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite quanto de rpm tem o motor.:");
        setRpm(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o tipo de combustivel do motor.:");
        setTipoCombustivel(sc.nextLine());
    }
    
    //método imprimir
    public void imprimirMotor() 
    {
        System.out.println("Potencia: " + getPotencia());
        System.out.println("RPM: " + getRpm());
        System.out.println("Tipo do combustivel: " + getTipoCombustivel());
    }
    
}
