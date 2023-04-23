/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Salario;

/**
 *
 * @author Gui
 */
public class Vendedor extends Empregado {
    
   private double valorVendas;
   private int qntVendas;

    public Vendedor(double salario) {
        super(salario);
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }
    
    @Override
public String toString() {
    return "Vendedor [nome=" + getNome() + ", Salario=" + getSalario() + ", Valor das Vendas=" + valorVendas + ", Quantidade Vendida=" + qntVendas+ "]";
}
    
    
}
