/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author YasmimMoreira
 */
public class TesteCalculadora {
    public static void main (String []args){
        Calculadora calc = new Calculadora();
        double a, b;
        
        
        Scanner in = new Scanner (System.in);
        System.out.println("Digite 2 numeros: ");
        a = in.nextDouble();
        b = in.nextDouble();
        
        
        double resultado = calc.somar(a, b);
        
        System.out.println("O resultado da sua soma é: " +resultado);
        
        System.out.println("Digite 2 numeros: ");
        a = in.nextDouble();
        b=in.nextDouble();
        
       
        double result = calc.divisao(a, b);
        
        System.out.println("O resultado da sua divisão é: " +result);
        
    }
}
