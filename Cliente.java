/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Salario;

/**
 *
 * @author Gui
 */
public class Cliente extends Pessoa{
    
    private double valorDivida;
    private int anoNascimento;

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
public String toString() {
    return "Cliente [nome=" + getNome() + ", Idade=" + getIdade() + ", Sexo=" + getSexo() + ", Divida=" + valorDivida + ", Ano do Nascimento=" + anoNascimento + "]";
}
    
    
}
