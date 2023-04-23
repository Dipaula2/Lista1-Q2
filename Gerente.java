/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Salario;

/**
 *
 * @author Gui
 */
public class Gerente extends Empregado {
    
    private String nomeGerencia;

    public Gerente(double salario) {
        super(salario);
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }
   
    @Override
    public String toString() {
        return "Gerencia [nome=" + getNome() + ", Idade=" + getIdade() + ", Matricula=" + getMatricula() + ", Nome da Gerencia=" + nomeGerencia + ", Valor do INSS=" + ValorInss() + "]";
    }    
}





