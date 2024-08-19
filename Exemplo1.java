package org.example;


import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario;

        System.out.println("Informe o valor do salário: ");
        salario = ler.nextDouble();

        salario += salario * 0.15;

        System.out.println("O valor do salário reajustado é: " + salario + "R$");
    }
}