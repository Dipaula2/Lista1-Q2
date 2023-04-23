/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Salario;


public class TesteSalario {

    
    public static void main(String args[]) {
         
        Cliente cliente = new Cliente();
        Vendedor vendedor = new Vendedor(3000.0);
        Gerente gerente = new Gerente(2000.0);
        Empregado empregado = new Empregado(0.0);
        
        
  
        
    cliente.setNome("Guilherme");
    cliente.setIdade(21);
    cliente.setSexo("Masculino");
    cliente.setValorDivida(2000.0);
    cliente.setAnoNascimento(2001);
        
    vendedor.setNome("Augusto");
    vendedor.setSalario(3000);
    vendedor.setValorVendas(1500);
    vendedor.setQntVendas(50);
    
    gerente.setNome("Fernando");
    gerente.setIdade(42);
    gerente.setMatricula("AMR2023");
    gerente.setNomeGerencia("El Plan");
          
       
        System.out.println(cliente.toString());
        System.out.println(vendedor.toString()); 
        System.out.println(gerente.toString()); 
    
   
           
            
    }
}
