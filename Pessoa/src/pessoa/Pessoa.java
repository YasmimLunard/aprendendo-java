/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoa;

/**
 *
 * @author YasmimMoreira
 */
public class Pessoa {

   String nome;
   int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void apresentar()
    {
        System.out.println("Oi, meu nome é " +nome+ " e tenho " +idade+ " anos.");
    }
    public void alterarDados(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
}
