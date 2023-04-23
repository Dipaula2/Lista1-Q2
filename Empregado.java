/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Salario;

/**
 *
 * @author Gui
 */
public class Empregado extends Pessoa {
    
    private double salario;
    private String matricula;
    private double bonus = 0.11;
    
    
    public Empregado(double salario) {
        this.salario = salario;
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
   public double ValorInss(){
    double salario = getSalario();
    if (salario > 0) {
        return salario * 0.11;
    } else {
        return 0;
    }
}
   
   
   
   
   
}
